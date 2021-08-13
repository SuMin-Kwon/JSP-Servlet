package co.yedam.shop;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


@WebServlet("/AddItemServlet.do")
public class AddItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddItemServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("get요청.");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		response.setContentType("text/json;charset=utf-8");
		
		System.out.println("post요청.");
		request.setCharacterEncoding("utf-8");
		
		String itemNo = request.getParameter("itemNo");
		String itemName = request.getParameter("itemName");
		String itemDesc = request.getParameter("itemDesc");
		String likeIt = request.getParameter("likeIt");
		String price = request.getParameter("price");
		String priceOff = request.getParameter("priceOff");
		String image = request.getParameter("image");
		
		ShopVO vo = new ShopVO();
		vo.setItemNo(itemNo);
		vo.setItemName(itemName);
		vo.setItemDesc(itemDesc);
		vo.setLikeIt(Double.parseDouble(likeIt));
		vo.setPrice(Integer.parseInt(price));
		vo.setPriceOff(Integer.parseInt(priceOff));
		vo.setImage(image);
		
		System.out.println(vo.toString());
		
		ShopDAO dao = new ShopDAO();
		dao.insertItem(vo);
		
		
		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(vo));
		
	}

}

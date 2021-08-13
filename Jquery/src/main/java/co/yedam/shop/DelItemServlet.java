package co.yedam.shop;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


@WebServlet("/DelItemServlet")
public class DelItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DelItemServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		response.setContentType("text/json;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String itemNo = request.getParameter("itemNo");
		
		ShopVO vo = new ShopVO();
		vo.setItemNo(itemNo);
		
		ShopDAO dao = new ShopDAO();
		dao.deleteItem(vo);
		
		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(vo));
	}

}

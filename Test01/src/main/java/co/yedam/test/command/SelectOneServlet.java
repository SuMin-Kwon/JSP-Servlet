package co.yedam.test.command;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.yedam.test.service.TestServiceMapper;
import co.yedam.test.vo.TestVO;


@WebServlet("/SelectOneServlet")
public class SelectOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SelectOneServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		
		TestServiceMapper dao = new TestServiceMapper();
		TestVO vo = new TestVO();
		vo.setId(request.getParameter("no"));
		vo = dao.testSelect(vo);
		
		Gson gson = new GsonBuilder().create();

		response.getWriter().print(gson.toJson(vo));
		
	}

}

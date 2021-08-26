package co.yedam.test.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.yedam.test.comm.Command;
import co.yedam.test.service.TestServiceMapper;
import co.yedam.test.vo.TestVO;

public class Home implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		
		TestServiceMapper dao = new TestServiceMapper();

		List<TestVO> list = dao.testList();
		Gson gson = new GsonBuilder().create();
		try {
			response.getWriter().print(gson.toJson(list));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*try {
			response.getWriter().println("<h2>dsad</h2>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub */
		
		
		return "home/home";
	}

}

package co.micol.prj.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.common.Command;
import co.micol.prj.member.web.Home;
import co.micol.prj.member.web.InsertForm;
import co.micol.prj.member.web.InsertMember;
import co.micol.prj.member.web.Login;
import co.micol.prj.member.web.MemberFail;
import co.micol.prj.member.web.MemberList;
import co.micol.prj.member.web.MemberOneList;

@WebServlet("*.do")
public class WebController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HashMap<String, Command> map = new HashMap<String, Command>();

	public WebController() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		map.put("/memberList.do", new MemberList());
		map.put("/home.do", new Home());
		map.put("/memberOneList.do", new MemberOneList());
		map.put("/login.do", new Login());
		map.put("/insertMember.do", new InsertMember());
		map.put("/insertForm.do", new InsertForm());
		map.put("/memberFail.do", new MemberFail());

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String page = uri.substring(contextPath.length());
		
		Command command = map.get(page);
		String viewPage = command.execute(request, response);
		
		if ( !viewPage.endsWith(".do")) {
			viewPage = "WEB-INF/views/" + viewPage + ".jsp";
		} 
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
		
	}

}

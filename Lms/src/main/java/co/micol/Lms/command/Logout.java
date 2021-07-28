package co.micol.Lms.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 로그아웃 폼
		HttpSession session = request.getSession(); // 세션객체 가지고옴
		session.invalidate(); // 세션을 죽임
		
		return "login.do";
	}

}

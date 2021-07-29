package co.micol.prj.member.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.prj.common.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.serviceImpl.MemberServiceImpl;
import co.micol.prj.member.vo.MemberVO;

public class Login implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 로그인
		
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo = dao.memberLogin(vo);
		String page = "";
		
		// 세션 사용
		HttpSession session = request.getSession(); 
		if (vo.getName() != null) {
			session.setAttribute("name", vo.getName()); 
			session.setAttribute("author", vo.getAuthor());
			session.setAttribute("id", vo.getId());
				
			page = "memberList.do"; // request에 안 담아도 세션객체에 담아서 값이 전달됨
			
		} else {
			page = "home.do";
		}
		
		return page;
	}

}

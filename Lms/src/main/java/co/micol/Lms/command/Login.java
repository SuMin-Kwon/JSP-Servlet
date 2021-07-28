package co.micol.Lms.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.Lms.board.service.BoardService;
import co.micol.Lms.board.serviceImpl.BoardServiceImpl;
import co.micol.Lms.board.vo.BoardVO;
import co.micol.Lms.member.service.MemberService;
import co.micol.Lms.member.vo.MemberVO;
import co.micol.Lms.serviceImpl.MemberServiceImpl;

public class Login implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO
		MemberService dao = new MemberServiceImpl(); // 인터페이스는 자기 자신의 객체를 생성할수 없어서 자식을 생성(membertable)
		BoardService boardDao = new BoardServiceImpl(); // 게시판 테이블

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
			List<BoardVO> list = new ArrayList<BoardVO>(); // 로그인 했을때 게시판을 가지고옴 
			list = boardDao.boardSelectList();
			request.setAttribute("boards", list);

			
			page = "main.do"; // request에 안 담아도 세션객체에 담아서 값이 전달됨
			
		} else {
			page = "loginForm.do";
		}

//		String id = request.getParameter("id");  
//		String password = request.getParameter("password");

//		request.setAttribute("id", id);
//		request.setAttribute("password", password);

		return page;
	}

}

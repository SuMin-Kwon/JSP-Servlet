package co.micol.Lms.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.Lms.sns.service.SnsService;
import co.micol.Lms.sns.serviceImpl.SnsServiceImpl;
import co.micol.Lms.sns.vo.SnsVO;

public class SearchSns implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 선택된 sns와 댓글을 보여주는 곳
		SnsService snsDao = new SnsServiceImpl();
		List<SnsVO> list = new ArrayList<SnsVO>();
		int n = Integer.valueOf(request.getParameter("sNo")); // 클릭하는 글의 순번을 값을 가져와서 정수에 넣어줌
		
		list = snsDao.snsSelect(n);
		
		request.setAttribute("list", list);
		
		return "main/snsDetail";
	}

}

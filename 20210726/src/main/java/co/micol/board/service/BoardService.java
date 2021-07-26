package co.micol.board.service;

import java.util.List;

import co.micol.board.vo.BoardVO;

public interface BoardService {
	
	List<BoardVO> boardSelectList(); // 전체조회
	
	BoardVO boardSelect (BoardVO vo); // 한 행조회
	
	int boardInsert(BoardVO vo); // 등록
	int boardDelete(BoardVO vo); // 삭제
	int boardUpdate(BoardVO vo); // 수정

}

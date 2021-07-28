package co.micol.board.service;

import java.util.List;

import co.micol.board.vo.BoardVO;

public interface BoardService {
	
	List<BoardVO> boardSelectList(); //전체조회
	
	BoardVO boardSelect(BoardVO vo); // 한 행 조회
	
	int boardInsert(BoardVO vo);
	int boardDelete(BoardVO vo);
	int boardUpdate(BoardVO vo);
}

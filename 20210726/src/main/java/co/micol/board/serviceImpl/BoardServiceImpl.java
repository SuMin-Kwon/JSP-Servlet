package co.micol.board.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.micol.board.dao.DAO;
import co.micol.board.service.BoardService;
import co.micol.board.vo.BoardVO;

public class BoardServiceImpl implements BoardService {
	
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	
	@Override
	public List<BoardVO> boardSelectList() {
		// TODO 게시판 전체 목록
		List<BoardVO> list = new ArrayList<BoardVO>();
		String sql = "select * from board";
		BoardVO vo;
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				vo = new BoardVO();
				vo.setbId(rs.getInt("bid"));
				vo.setbTitle(rs.getString("btitle"));
	//			vo.setbContent(rs.getString("bcontent"));
				vo.setbWriter(rs.getString("bwriter"));
				vo.setbDate(rs.getDate("bdate"));
				vo.setbHit(rs.getInt("bhit"));
				list.add(vo);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return list;
	}

	// 닫아주는 메소드
	private void close() {
		try {
			if (rs != null) rs.close();
			if (psmt != null) psmt.close();
			if (conn != null) conn.close();
			
		}catch (SQLException e ) {
			e.printStackTrace();
		}
		
	}

	@Override
	public BoardVO boardSelect(BoardVO vo) {
		// TODO 한 행만 가져오기
		String sql = "select * from board where bid=?";
		
		return vo;
	}

	@Override
	public int boardInsert(BoardVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int boardDelete(BoardVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int boardUpdate(BoardVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}

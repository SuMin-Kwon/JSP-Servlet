package co.yedam.test.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.test.comm.DataSource;
import co.yedam.test.vo.TestVO;

public class TestServiceMapper implements TestService {
	
	private SqlSession sqlSession = DataSource.getInstance().openSession();
	private TestService map = sqlSession.getMapper(TestService.class);

	@Override
	public List<TestVO> testList() {
		// TODO Auto-generated method stub
		return map.testList();
	}

	@Override
	public TestVO testSelect(TestVO vo) {
		// TODO Auto-generated method stub
		return map.testSelect(vo);
	}

	@Override
	public int testInsert(TestVO vo) {
		// TODO Auto-generated method stub
		return map.testInsert(vo);
	}

	@Override
	public int testDelete(TestVO vo) {
		// TODO Auto-generated method stub
		return map.testDelete(vo);
	}

	@Override
	public int testUpdate(TestVO vo) {
		// TODO Auto-generated method stub
		return map.testUpdate(vo);
	}

}

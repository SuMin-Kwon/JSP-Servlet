package co.yedam.test.service;

import java.util.List;

import co.yedam.test.vo.TestVO;

public interface TestService {
	
	List<TestVO> testList();
	
	TestVO testSelect(TestVO vo);
	
	int testInsert(TestVO vo);
	int testDelete(TestVO vo);
	int testUpdate(TestVO vo);
	

}

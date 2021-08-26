package co.yedam.test.comm;


import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DataSource {
	
	private static SqlSessionFactory sqlSessionFactory;
	
	private DataSource( ) {}
	
	public static SqlSessionFactory getInstance() {
		
		try {
			
			String resource = "config/mybatis-Config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);  //properties를 읽어옴 ( key : value 로 맵 형식으로 읽어옴)
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return sqlSessionFactory;
	}

}

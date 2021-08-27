package co.yedam.test.vo;

import java.sql.Date;

public class TestVO {

	private int no;
	private String id;
	private String tel;
	private Date birth;
	private String address;
	private String name;
	
	public TestVO() {
		// TODO Auto-generated constructor stub
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TestVO [no=" + no + ", id=" + id + ", tel=" + tel + ", birth=" + birth + ", address=" + address
				+ ", name=" + name + "]";
	}

	
	
	
}

package member.domain;

import java.sql.Connection;

public class MemberVO {
	
	private int id;
	private String name;
	private String addr;
	private String nation;
	private String email;
	private int age;
	
	//생성자 오버로딩 -하나의 클래스의 여러개의 생성자가 생성되는거
	public MemberVO() {
		super();
	}


	public MemberVO(String name, String addr, String nation, String email, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.nation = nation;
		this.email = email;
		this.age = age;
	}


	
	public MemberVO(int number, String name, String addr, String nation, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.nation = nation;
		this.email = email;
		this.age = age;
	}


	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setNation(String nation) {
		this.nation = nation;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public String getNation() {
		return nation;
	}



	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
	
	



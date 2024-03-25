package com.spring.ex2;

public class LoginVO {

	String id;
	String name;
	
	public LoginVO() {
		// TODO Auto-generated constructor stub
	}

	public LoginVO(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

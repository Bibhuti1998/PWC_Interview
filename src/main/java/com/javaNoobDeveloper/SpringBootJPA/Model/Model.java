package com.javaNoobDeveloper.SpringBootJPA.Model;

public class Model {
	
	String id;
	String name;
	String username;
	String phone_no;
	public Model(String id, String name, String username, String phone_no) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.phone_no = phone_no;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	
	

}

package com.pojo;

import java.util.Date;

public class User {
	 //id | name    | email          | password | reg_amt | reg_date   | role
	private int id;
	private String name;
	private String email;
	private String password;
	private double regamt;
	private Date regdate;
	private String role;
	
	public User(int id, String name, String email, String password, double regamt, Date regdate, String role) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.regamt = regamt;
		this.regdate = regdate;
		this.role = role;
	}
	
	public User(String name, String email, String password, double regamt, Date regdate, String role) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.regamt = regamt;
		this.regdate = regdate;
		this.role = role;
	}
	
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRegamt() {
		return regamt;
	}

	public void setRegamt(double regamt) {
		this.regamt = regamt;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", regamt="
				+ regamt + ", regdate=" + regdate + ", role=" + role + "]";
	}
	
}

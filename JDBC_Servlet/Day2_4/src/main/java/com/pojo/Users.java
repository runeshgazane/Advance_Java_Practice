package com.pojo;

public class Users {
	private int id;
	private String name;
	private String city;
	private String email;
	private String password;
	
	public Users(String name, String city, String email, String password) {
		this.name = name;
		this.city = city;
		this.email = email;
		this.password = password;
	}
	
	public Users(String email, String password) {
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", email=" + email + ", password=" + password
				+ "]";
	}
}

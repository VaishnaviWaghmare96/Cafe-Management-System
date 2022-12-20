package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Login {
	@Id@GeneratedValue
	private int id;
	private String username;
	private String name;
	private String password;
	private long phoneno;
	
	public Login(int id, String username, String name, String password, long phoneno) {
		
		this.id = id;
		this.username = username;
		this.name = name;
		this.password = password;
		this.phoneno = phoneno;
	}

	public Login() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", username=" + username + ", name=" + name + ", password=" + password + ", phoneno="
				+ phoneno + "]";
	}
	



	
	

}

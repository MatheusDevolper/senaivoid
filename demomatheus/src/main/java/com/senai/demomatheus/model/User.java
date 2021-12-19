package com.senai.demomatheus.model;

public class User {
	private long id;
	private String fullName;
	private String nickName;
	private String email;
	private String password;
	private LevelUser levelUser;
	
	public User(long id, String fullName, String nickName, String email, String password, LevelUser levelUser) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.nickName = nickName;
		this.email = email;
		this.password = password;
		this.levelUser = levelUser;
	}
	public long getId() {
		return id;
	}
	public String getFullName() {
		return fullName;
	}
	public String getNickName() {
		return nickName;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", nickName=" + nickName + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	
}

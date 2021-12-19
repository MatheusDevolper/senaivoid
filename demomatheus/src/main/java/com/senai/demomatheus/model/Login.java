package com.senai.demomatheus.model;

import java.util.Arrays;
import java.util.List;

public class Login {

	private long id;
	private String email;
	private String password;
	private Boolean status;
	
	public Login(String email, String password) {
		this.status = false;
		List<User> users = Arrays.asList(
				new User(1, "User01 FullName", "usernick1", "user01fullname@gmail.com", "user01pass", new LevelUser(1, "Master", "Administrador que tem o maior acesso.")),
				new User(2, "User02 FullName", "usernick2", "user02fullname@gmail.com", "user01pass", new LevelUser(2, "Commom", "Administrador que não tem o muito acesso.")),
				new User(3, "User03 FullName", "usernick3", "user03fullname@gmail.com", "user01pass", new LevelUser(3, "Tecnic", "Administrador que tem o mediano acesso.")),
				new User(4, "User04 FullName", "usernick4", "user04fullname@gmail.com", "user01pass", new LevelUser(2, "Commom", "Administrador que tem o nível de acesso mais baixo."))
				);
		
		this.email = email;
		this.password = password;
		
		if(this.email != null || this.email != "") {
			for (int i = 0; i < users.size(); i++) {
				if((users.get(i).getEmail() == this.email ) && (users.get(i).getPassword() == this.password)) {
					this.status = true;
				}
			}
		}
	}

	public long getId() {
		return id;
	}


	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
	
	public Boolean getStatus() {
		return this.status;
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", email=" + email + ", password=" + password + "]";
	}
	
	
}

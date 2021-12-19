package com.senai.demomatheus.model;

public class Ticket {
	private long id;
	private String title;
	private String description;
	private String user;
	private Prioridade prioridade;
	
	public Ticket(long id, String title, String description, String user, Prioridade prioridade) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.user = user;
		this.prioridade = prioridade;
	}
	
	public long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public String getUser() {
		return user;
	}
	
	public Prioridade getPrioridade() {
		return prioridade;
	}
	
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", title=" + title + ", description=" + description + ", user=" + user + ", priority=" + prioridade + "]";
	}
	
	
}

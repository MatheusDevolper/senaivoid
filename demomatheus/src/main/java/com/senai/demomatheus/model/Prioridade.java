package com.senai.demomatheus.model;

public class Prioridade {
	private long id;
	private String name;
	private String description;
	
	public Prioridade(long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return "Prioridade [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
}

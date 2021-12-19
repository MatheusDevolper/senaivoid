package com.senai.demomatheus.model;

public class LevelUser {

	private long id;
	private String shortDescription;
	private String longDescription;
	
	public LevelUser(long id, String shortDescription, String longDescription) {
		super();
		this.id = id;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	public long getId() {
		return id;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public String getLongDescription() {
		return longDescription;
	}
	@Override
	public String toString() {
		return "LevelUser [id=" + id + ", shortDescription=" + shortDescription + ", longDescription=" + longDescription
				+ "]";
	}
	
	
}

package com.app;

public class First {
	private String name;
	private int id;
	
	public First() {
		super();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "First [name=" + name + ", id=" + id + "]";
	}
	
	
}

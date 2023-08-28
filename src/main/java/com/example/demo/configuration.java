package com.example.demo;

public class configuration {
	private int id;
	private String name;
	private String descrp;
	public configuration() {
		System.out.println("default constructor is called");
	}
	public configuration(int id, String name, String descrp) {
		super();
		this.id = id;
		this.name = name;
		this.descrp = descrp;
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
	public String getDescrp() {
		return descrp;
	}
	public void setDescrp(String descrp) {
		this.descrp = descrp;
	}
	

}

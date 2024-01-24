package com.jsp.jdbc_prepared_statement.entity;

/**
 * @author Saurabh Kumar
 * I have created this class for 
 */




public class laptop {
	private int id;
	private String name;
	private String Color;
	private double price;
	private int ram;
	
	/*
	 * 
	 */
	
	public laptop() {
		super();
	}
	
	
	
	public laptop(int id, String name, String color, double price, int ram) {
		super();
		this.id = id;
		this.name = name;
		this.Color = color;
		this.price = price;
		this.ram = ram;
	}



	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return Color;
	}
	public double getPrice() {
		return price;
	}
	public int getRam() {
		return ram;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setColor(String color) {
		Color = color;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}

@Override
public String toString()
{
	return "\nid="+id+"\nname="+name+"\nColor="+Color+"\nprice="+price+"\nram="+ram+"\n";
}


	
}

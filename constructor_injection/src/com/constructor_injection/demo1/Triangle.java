package com.constructor_injection.demo1;

public class Triangle {
	private String Type;
	private int Hight;
	//these are injecting primitives
	
	public Triangle(int hight) {
		super();
		Hight = hight;
	}
	public Triangle(String type) {
		super();
		Type = type;
	}
	public Triangle(String type, int hight) {
		super();
		Type = type;
		Hight = hight;
	}
	public String getType() {
		return Type;
	}
	public int getHight() {
		return Hight;
	}
	public void draw()
	{
		System.out.println(getType()+" :   shape of triangle  : "+getHight());
	}

}

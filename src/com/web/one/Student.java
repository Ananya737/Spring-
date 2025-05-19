package com.web.one;

public class Student {

	String name;
	String roll;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	
	public void display() {
		System.out.println(name+ " " + roll);
	}
	
}

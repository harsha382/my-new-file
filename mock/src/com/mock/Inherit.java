package com.mock;

public class Inherit {
	private String name;
	private String place;

	public Inherit(String name, String place) {

		this.name = name;
		this.place = place;
	}

	public void eat() {
		System.out.println("food");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place=place;
		
	}

}

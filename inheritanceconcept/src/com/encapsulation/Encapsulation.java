package com.encapsulation;

public class Encapsulation {
	private String customername;
	private int age;
	private String address;

	public Encapsulation(String customername, int age, String address) {
		this.customername = customername;
		this.age = age;
		this.address = address;
	}

	public String getAddress() {
		return address;

	}

	public String getCustomername() {
		return customername;
	}

	public int getAge() {
		return age;
	}

}

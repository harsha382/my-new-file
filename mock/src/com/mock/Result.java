package com.mock;

public class Result {
	public static void main(String[] args) {
		Inherit I = new Inherit("name", "place");
		I.eat();
		System.out.println(I.getName());
	}

}

package com.encapsulation;

public class Main {

	public static void main(String[] args) {
		Encapsulation E1 = new Encapsulation("harsha", 24, "kothagudem");

		System.out.println("customer age:" + E1.getAge());
		System.out.println("customer name:" + E1.getCustomername());
		System.out.println("customer address:" + E1.getAddress());

	}

}

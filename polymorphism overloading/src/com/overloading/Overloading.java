package com.overloading;

public class Overloading {

	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	public void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {

		Overloading over = new Overloading();
		over.sum(100, 3000);
		over.sum(1200, 200, 400);

	}
}

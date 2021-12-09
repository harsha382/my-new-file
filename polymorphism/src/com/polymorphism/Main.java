package com.polymorphism;

public class Main {

	public static void main(String[] args) {
		Animal A1 = new Dog();
		System.out.println(A1.eat());
		Animal A2 = new Cat();
		System.out.println(A2.eat());
		Animal A3 = new Animal();
		System.out.println(A3.eat());

	}
}

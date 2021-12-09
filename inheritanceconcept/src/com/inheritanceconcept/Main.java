package com.inheritanceconcept;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("pamerian", 1, 2, 3, 4, 5, 6, 7, "wit");
		dog.run(10);
		dog.walk(10);
		System.out.println(dog.getName());
		System.out.println(dog.getCoat());
	}

}

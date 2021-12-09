package com.problem;

import java.util.Scanner;

public class Millineals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi please enter your name");
		String str = sc.nextLine().toLowerCase();
		System.out.println("Please enter your age");

		int age = sc.nextInt();

		if (age <= 24) {
			System.out.println("your age is:" + age + ":So you are a GenZ");
		} else if (age >= 25) {
			System.out.println("your age is:" + age + ":So you are a Millinial");
		} else if (age >= 41) {
			System.out.println("your age is:" + age + "You are a Genx");

		}

	}
}

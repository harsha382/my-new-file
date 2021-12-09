package com.overloadingnew;

public class Polymorphism {
	public static void main(String[] args) {
		Bank b = new Sbi();
		System.out.println("rate of intrest of SBI=" + b.intrest());
		Bank b1 = new Icici();
		System.out.println("rate of intrest of Icici=" + b1.intrest());
	}
}

package com.inheritanceconcept;

public class Dog extends Animal {
	private int legs;
	private int eyes;
	private int tail;
	private String coat;

	public Dog(String name, int body, int size, int weight, int brain, int legs, int eyes, int tail, String coat) {
		super(name, body, size, weight, brain);
		this.legs = legs;
		this.eyes = eyes;
		this.tail = tail;
		this.coat = coat;
	}

	public void run(int speed) {

		chew();
		System.out.println("run method called" + speed);
	}

	public void walk(int speed) {
		System.out.println("walk method called: km per hour" + speed);
		jump();

	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}

	public String getCoat() {
		return coat;
	}

	public void setCoat(String coat) {
		this.coat = coat;
	}

}

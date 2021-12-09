package com.inheritanceconcept;

public class Animal {
	private String name;
	private int body;
	private int size;
	private int weight;
	private int brain;

	public String eat(String egg) {
		return ("eat method called" + egg);

	}

	public void jump() {
		System.out.println("jumps");
	}

	public void chew() {
		System.out.println("chew method called");
	}

	public Animal(String name, int body, int size, int weight, int brain) {
		super();
		this.name = name;
		this.body = body;
		this.size = size;
		this.weight = weight;
		this.brain = brain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBody() {
		return body;
	}

	public void setBody(int body) {
		this.body = body;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getBarin() {
		return brain;
	}

	public void setBarin(int barin) {
		this.brain = barin;
	}

}

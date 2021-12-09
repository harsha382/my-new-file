package com.treeset;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("hyderabad ");
		list.add("ahmedabad");
		list.add("chennai");
		list.add("mumbai");
		list.add("chennai");
		System.out.println("using linkedlist:" + list);
		list.add(3, "kashmir");
		System.out.println("after adding element:" + list);
		

	}

}

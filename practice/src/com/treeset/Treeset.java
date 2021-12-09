package com.treeset;

import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		//System.out.println("before using Treeset:" + t);
		t.add("hyderabad");
		t.add("bangalore");
		t.add("mumbai");
		t.add("ahmedabad");
		t.add("hyderabad");
		System.out.println(
				"After using Treeset:" + t + ":here one duplicate is removed becoz treeset won't allow duplicates");
	}

}

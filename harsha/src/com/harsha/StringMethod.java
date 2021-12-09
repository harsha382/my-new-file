package com.harsha;

import java.util.Arrays;

public class StringMethod {
	 public static void main(String[] args)
	    {
	        Student[] arr = { new Student(101,"harsha", "hyderabad"),
	                          new Student(131, "himam", "khammam"),
	                          new Student(121, "deva", "jaipur") };
	  
	        System.out.println(Arrays.toString(arr));
	    }
	}
	  
	// A class to represent a student,
	class Student {
	    int rollno;
	    String name, address;
	  
	    // Constructor	
	    public Student(int rollno, String name,
	                   String address)
	    {
	        this.rollno = rollno;
	        this.name = name;
	        this.address = address;
	    }
	  
	    // Used to print student details in main()
	   
	    public String toString()
	    {
	        return this.rollno + " " + this.name + " " + this.address;
	    }
	}   
	  
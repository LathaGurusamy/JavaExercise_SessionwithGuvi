package com.example.hrtest;

import java.util.ArrayList;


public class arraylist {

	public static void main(String[] args)
	{
		//Write a Java program to create an ArrayList of strings and then remove all the elements from the ArrayList.
		

		        ArrayList<String> stringList = new ArrayList<>();

		        // Add some elements to the ArrayList
		        stringList.add("Java");
		        stringList.add("Python");
		        stringList.add("C++");
		        stringList.add("JavaScript");

		        System.out.println("Elements before removal: " + stringList);

		        //stringList.clear();
		        stringList = new ArrayList<>();


		        System.out.println("Elements after removal: " + stringList);
		    }
		}

/*****************
 output:
 Elements before removal: [Java, Python, C++, JavaScript]
Elements after removal: []
 
 
 
 */

	



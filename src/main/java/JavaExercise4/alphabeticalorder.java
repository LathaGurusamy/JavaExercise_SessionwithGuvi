package JavaExercise4;

import java.util.Map;
import java.util.TreeMap;

import java.util.HashMap;
import java.util.Set;



public class alphabeticalorder {

	public static void main(String[] args) 
	{

		//Write a Java program to create a TreeMap of mployee ID's and names.
		//Then print out the names of all the employees in alphabetical order.
	


		        TreeMap<Integer, String> employeeMap = new TreeMap<>();

		        employeeMap.put(101, "Alice");
		        employeeMap.put(102, "Bob");
		        employeeMap.put(103, "Charlie");
		        employeeMap.put(104, "David");

		        System.out.println("Names of Employees in Alphabetical Order:");

		        for (String employeeName : employeeMap.values()) {
		            System.out.println(employeeName);
		        }
		    }
		}

		
/***********8
 output:
 Key-Value pairs in the map:
Key: Java, Value: 20
Key: C++, Value: 10
Key: Python, Value: 15
 
 
 
 */
		        

package task5CollectionConcept;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class EmployeeAplhabeticOrder {

	public static void main(String[] args) {
	
		//Write a Java program to create a TreeMap of mployee ID's and names.
				//Then print out the names of all the employees in alphabetical order.
			

		 // Creating a TreeMap to store employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Adding employees to the TreeMap in non-alphabetical order
        employeeMap.put(101, "Bob");
        employeeMap.put(103, "David");
        employeeMap.put(104, "Charlie");
        employeeMap.put(102, "Alice");

        // Using a TreeSet to automatically sort names in alphabetical order
        TreeSet<String> sortedNames = new TreeSet<>(employeeMap.values());

        // Printing the employee names in alphabetical order
        System.out.println("Employee names in alphabetical order:");
        for (String name : sortedNames) {
            System.out.println(name);
        }
        
     // Printing the employee names in the order of their IDs
        System.out.println("Employee names in the order of their IDs:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet())
        {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
            
        }
}
}

 /*****************
		 output:
		 Employee names in alphabetical order:
Alice
Bob
Charlie
David
Employee names in the order of their IDs:
ID: 101, Name: Bob
ID: 102, Name: Alice
ID: 103, Name: David
ID: 104, Name: Charlie

		 
		 
		 */
				        

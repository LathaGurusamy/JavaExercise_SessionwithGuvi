package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest 
{

	public static void main(String[] args) 
	{
		
		// Create an instance of the Employee class
        Employee emp = new Employee("John Doe", 101, 75000.00);

        // Call the methods to print the employee's name and salary
        emp.printName();
        emp.printSalary();

	}

}

/*********
Employee Name: John Doe
Employee Salary: $75000.0

*************/
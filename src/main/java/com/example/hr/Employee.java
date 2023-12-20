package com.example.hr;


	// File: com/example/hr/Employee.java


	public class Employee
	{
	    private String name;
	    private int id;
	    private int salary;

	    public Employee(String name, int id, int salary) {
	        this.name = name;
	        this.id = id;
	        this.salary = salary;
	    }

	    public void printName() {
	        System.out.println("Employee Name: " + name);
	    }

	    public void printSalary() {
	        System.out.println("Employee Salary: $" + salary);
	    }
	}




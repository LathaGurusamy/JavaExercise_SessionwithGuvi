package task1IntrductiontoJava;

import java.util.Scanner;

public class TenthProgramToCountNumberofDigit {

	public static void main(String[] args) {


	    // Write a program to Count Number of Digits in an Integer.
		
		//Output
		//Enter an integer: 4321556
		//Number of digits: 7

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an integer: ");

	        // Validate input to ensure it's a valid integer
	        while (!scanner.hasNextLong()) {
	            System.out.print("Invalid input. Please enter a valid integer: ");
	            scanner.next(); // Consume the invalid input
	        }

	        Long number = scanner.nextLong();

	        // Handle negative number by converting to positive
	        if (number < 0) {
	            number = -number;
	        }

	        int digitCount = 0;

	        while (number != 0) {
	            digitCount++;
	            number = number / 10;
	        }

	        System.out.println("Number of digits: " + digitCount);
	    }



	}


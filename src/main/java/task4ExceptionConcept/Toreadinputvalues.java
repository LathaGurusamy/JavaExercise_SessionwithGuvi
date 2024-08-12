package task4ExceptionConcept;

import java.util.Scanner;

public class Toreadinputvalues

{
	//Write a Java Program that reads user input for tw integers and performs division.
	//Handle the exception that is thrown when the second number is zero.and display an error message to the user.
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int denominator = scanner.nextInt();

            double result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static double divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) numerator / denominator;
    }
}




		//output
		//Enter the first integer: 35
		//Enter the second integer: 0
		//Error: Division by zero is not allowed.
             
            
		       //output    		        
		      //  Enter the first integer: 80
		       // Enter the second integer: 2
		        //Result of division: 40.0


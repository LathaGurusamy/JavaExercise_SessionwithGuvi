package task4ExceptionConcept;

import java.util.Scanner;

import task4ExceptionConcept.AgeValidationProgram;

/*************
7.Create a custom exception in Java called  "InvalidAgeException" that is thrown when the user 
enters an age less than 18.Implement exception handling in a Java program to catch the
"InvalidAgeException"  and display an error message.


*/

//Custom exception for invalid age
//InvalidAgeException.java
 class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}


//Main.java

public class AgeValidationProgram 
{
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     try {
         System.out.print("Enter your age: ");
         int age = scanner.nextInt();
         
         // Validate age
         if (age < 18) {
             throw new InvalidAgeException("Age must be 18 or above.");
         }
         
         System.out.println("Your age is: " + age);
     } catch (InvalidAgeException e) {
         System.out.println("InvalidAgeException: " + e.getMessage());
     } finally {
         scanner.close();
     }
 }
}


/*********
Enter your age: 20
Your age is: 20


Enter your age: 16
InvalidAgeException: Age must be 18 or above.

*********/

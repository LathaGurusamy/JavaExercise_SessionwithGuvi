package JavaExercise3;
import java.util.Scanner;

/*************
 7.Create a custom exception in Java called  "InvalidAgeException" that is thrown when the user 
enters an age less than 18.Implement exception handling in a Java program to catch the
"InvalidAgeException"  and display an error message.
 
 
 */

//Custom exception for invalid age
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super();
 }
}

public class AgeValidationProgram {
 // Method to validate the age
 private static void validateAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Invalid age. Age must be 18 or older.");
     }
 }

 public static void main(String[] args) {
     // Create a Scanner object to read user input
     Scanner scanner = new Scanner(System.in);

     try {
         // Prompt the user to enter the age
         System.out.print("Enter your age: ");
         int enteredAge = scanner.nextInt();

         // Validate the entered age
         validateAge(enteredAge);

         // If the age is valid, continue with the program
         System.out.println("Age is valid!");

     } catch (InvalidAgeException e) {
         // Handle the custom exception by displaying an error message
         System.err.println("Error: " + e.getMessage());
     } catch (Exception e) {
         // Handle other exceptions, if any
         System.err.println("An error occurred: " + e.getMessage());
     } finally {
         // Close the Scanner to avoid resource leaks
         scanner.close();
     }
 }
}

/*********
 Enter your age: 54
Age is valid!

 Enter your age: 16
Error: null
 *********/

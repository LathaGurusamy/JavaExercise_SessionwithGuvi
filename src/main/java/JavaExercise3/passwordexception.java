package JavaExercise3;
import java.util.Scanner;


public class passwordexception 
{
	//You are building a login system for a website using Java.if the user enters an incorrect password,you want to display a message informing them of the error.
	//How would you use exception handling to handle this exception.

	    private static final String CORRECT_PASSWORD = "secret123";

	    private static void validatePassword(String enteredPassword) {
	        if (!enteredPassword.equals(CORRECT_PASSWORD)) {
	            throw new IllegalArgumentException("Incorrect password. Please try again.");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter your password: ");
	            String enteredPassword = scanner.nextLine();

	            validatePassword(enteredPassword);

	            System.out.println("Login successful!");

	        } catch (IllegalArgumentException e) {
	            System.err.println("Error: " + e.getMessage());
	        } catch (Exception e) {
	            System.err.println("An error occurred: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }
	}

/**************
 
 Output1:
======
Enter your password: secret123
Login successful!
Output2:
======

Enter your password: gdhsds\
Error: Incorrect password. Please try again.
 
 
 
 
 
 
 
 
 **********/

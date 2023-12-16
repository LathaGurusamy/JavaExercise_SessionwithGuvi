package JavaExercise1;
import java.util.Scanner;


public class seniorcitizen {

	public static void main(String[] args)
	{
		

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter your age: ");
		        int age = scanner.nextInt();
		        
		        
		     // Handle negative age by converting to positive
		        if (age < 0) {
		            age = -age;
		        }

		        if (age >= 60) {
		            System.out.println("You are a senior citizen.");
		        } else {
		            System.out.println("You are not a senior citizen.");
		        }

		        scanner.close();
		    }
		}

    //output:
	//Enter your age: 88
	//You are a senior citizen.

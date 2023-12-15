package JavaExercise1;
import java.util.Scanner;

public class factorial 
{

	//write a program to print the factorial of a given number
		

		    public static long calculateFactorial(int number) {
		        if (number == 0) {
		            return 1;
		        }

		        long factorial = 1;

		        for (int i = 1; i <= number; i++) {
		            factorial *= i;
		        }

		        return factorial;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a number to calculate its factorial: ");
		        int userNumber = scanner.nextInt();

		        if (userNumber < 0) {
		            System.out.println("Factorial is not defined for negative numbers.");
		        } else {
		            long factorial = calculateFactorial(userNumber);
		            System.out.println("Factorial of  " + userNumber + "! is: " + factorial);
		        }

		        scanner.close();
		    }
		}

//output
//Enter a number to calculate its factorial: 3
//Factorial of 5 is: 120

	



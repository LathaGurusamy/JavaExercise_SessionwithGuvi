package JavaExercise2;
import java.util.Scanner;

public class largestnumber {

	public static void main(String[] args) 
	{
		//Write a program to calculate the largest number among three numbers.
		        Scanner scanner = new Scanner(System.in);

		        // Input: Three numbers
		        System.out.print("Enter the first number: ");
		        double num1 = scanner.nextDouble();

		        System.out.print("Enter the second number: ");
		        double num2 = scanner.nextDouble();

		        System.out.print("Enter the third number: ");
		        double num3 = scanner.nextDouble();

		        // Calculate the largest number
		        double largestNumber = findLargestNumber(num1, num2, num3);

		        // Output the result
		        System.out.println("The largest number is: " + largestNumber);

		        scanner.close();
		    }

		    private static double findLargestNumber(double num1, double num2, double num3) {
		        double largestNumber = num1;

		        if (num2 > largestNumber) {
		            largestNumber = num2;
		        }

		        if (num3 > largestNumber) {
		            largestNumber = num3;
		        }

		        return largestNumber;
		    }
		}

	/*************************
Enter the first number: 56
Enter the second number: 3
Enter the third number: 4545
The largest number is: 4545.0
*****/
	

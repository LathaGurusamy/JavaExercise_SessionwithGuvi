package JavaExercise1;
import java.util.Scanner;


public class countnumberofdigit {
	//10.Write a program to Count Number of Digits in an Integer.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter an integer: ");
		        
		        int number = scanner.nextInt();

		        scanner.close();


		        int digitCount = 0;

		        while (number != 0) {
		            digitCount++;

		            number = number / 10;
		        }

		        System.out.println("Number of digits: " + digitCount);
		    }
		}

//output
//Enter an integer: 5453
//Number of digits: 4

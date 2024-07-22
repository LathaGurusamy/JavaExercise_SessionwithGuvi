package String.task1IntrductiontoJava;

import java.util.Scanner;

public class FourthProgramSwappingTwoNumbers {

	public static void main(String[] args) {
		/************
		 * *******************

		Write a java  progran to get 2 numbers from the user and swap their values
		without any loss of data.you can make use of additional variable for swapping.
		print the corresponding swapped values of the two numbers as output in the console.
          
         *****/
		

/*************************
Enter the first number: 
6
Enter the second number: 
5
Original values: 
First number: 6
Second number: 5

Swapped values: 
First number: 5
Second number: 6
******************************/
		
		
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter the first number: ");
		        int num1 = scanner.nextInt();

		        System.out.println("Enter the second number: ");
		        int num2 = scanner.nextInt();

		        System.out.println("Original values: ");
		        System.out.println("First number: " + num1);
		        System.out.println("Second number: " + num2);

		        int temp = num1;//num1 is 5 assigned to temp,since temp=5;
		        num1 = num2;//num2 is 7 assigned to num1,since num1=7;
		        num2 = temp;//temp is assigned with 5,since num2=5;

		        System.out.println("\nSwapped values: ");
		        System.out.println("First number: " + num1);//7
		        System.out.println("Second number: " + num2);//5
		        scanner.close();
		    }
	}



package task2ControlStatement;

import java.util.Scanner;

public class ThirdProgramToPrintBlowGivenPattern {

	public static void main(String[] args) {

		//write a progran to print the given below pattern
		
		/**********
		 Input:Enter the number of rows: 4
		 
		 output
		 =======
		1 
		2 3 
		4 5 6 
		7 8 9 10 
		 
		 
		 
		 */		{

			
			        Scanner scanner = new Scanner(System.in);

			        System.out.print("Enter the number of rows: ");
			        int numRows = scanner.nextInt();
			        scanner.close();

			        int currentNumber = 1;

			        for (int i = 1; i <= numRows; i++) { // Outer loop
			            for (int j = 1; j <= i; j++) {  // Inner loop
			                System.out.print(currentNumber + " ");
			                currentNumber++;
			            }
			            System.out.println();  // Move to the next line after printing each row
			        }
			    }
			}
	}


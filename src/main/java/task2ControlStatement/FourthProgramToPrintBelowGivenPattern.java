package task2ControlStatement;

/***************************************
   Input
   =======
   
   Enter the size of the pattern: 5
   
 Output
 ==========  
*   *
 * * 
  *  
 * * 
*   *


*************************************************/



import java.util.Scanner;

public class FourthProgramToPrintBelowGivenPattern {

		 public static void main(String[] args) 
		 
		 {
			 	Scanner scanner = new Scanner(System.in);

			         // Input: Size of the pattern
			         System.out.print("Enter the size of the pattern: ");
			         int n = scanner.nextInt();

			         // Print the pattern
			         printPattern(n);

			         scanner.close();
			     }

			     private static void printPattern(int n) {
			         for (int i = 0; i < n; i++) {
			             for (int j = 0; j < n; j++) {
			                 if (i == j || i + j == n - 1) {
			                     System.out.print("*");
			                 } else {
			                     System.out.print(" ");
			                 }
			             }
			             System.out.println();
			         }
			     }
			 }
		        
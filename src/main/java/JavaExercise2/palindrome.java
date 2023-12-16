package JavaExercise2;
import java.util.Scanner;


public class palindrome {

	public static void main(String[] args) 
	
	{
		
		//Write  a Program to check whether a given string is a palindrome or not using for loop and if-else statement in java 
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();

		        if (isPalindrome(input)) {
		            System.out.println("The string is a palindrome.");
		        } else {
		            System.out.println("The string is not a palindrome.");
		        }

		        scanner.close();
		    }

		    static boolean isPalindrome(String str) {
		        // Remove spaces and convert to lowercase for case-insensitive comparison
		        str = str.replaceAll("\\s", "").toLowerCase();

		        int start = 0;
		        int end = str.length() - 1;

		        while (start < end) {
		            if (str.charAt(start) != str.charAt(end)) {
		                return false;
		            }
		            start++;
		            end--;
		        }

		        return true;
		    }
		
}

//Enter a string: tiy84
//The string is not a palindrome.


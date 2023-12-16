package JavaExercise2;

import java.util.Scanner;

public class reversetring
{
	
	//Write  a program that reads in a string from the user  and uses a loop to reverse the order of the 
	//character in the string.Then output of reversed string.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        scanner.close();

        char[] charArray = inputString.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        System.out.print("Reversed string: ");
        for (char c : charArray) {
            System.out.print(c);
        }
    }
}


//output:
	//Enter a string: Kalah
	//Reversed string: halaK
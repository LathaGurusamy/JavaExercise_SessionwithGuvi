package task2ControlStatement;

import java.util.Scanner;


/*******************
 * Enter the marks: 
85
B

 * 
 */

public class FifthProgramStudentMarkList {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter the marks: ");
        int marks = scanner.nextInt();

        // Output
        if (marks > 100 || marks < 0) {
            System.out.println("Invalid Input");
        } else {
            String grade = calculateGrade(marks);
            System.out.println(grade);
        }

        scanner.close();
    }

    // Function to calculate grade based on marks
    private static String calculateGrade(int marks)
    {
        if (marks == 100) 
        {
            return "S";
        } 
        else if (marks >= 90 && marks < 99)
        {
            return "A";
        } 
        else if (marks >= 80 && marks < 89)
        {
            return "B";
        } 
        else if (marks >= 70 && marks < 79)
        {
            return "C";
        } 
        else if (marks >= 60 && marks < 69)
        {
            return "D";
        } 
        else if (marks >= 50 && marks < 59)
        {
            return "E";
        } 
        else if (marks >= 0 && marks < 50)
        {
            return "Fail";
        } else {
            return "Invalid Input";
        }
    }




	}



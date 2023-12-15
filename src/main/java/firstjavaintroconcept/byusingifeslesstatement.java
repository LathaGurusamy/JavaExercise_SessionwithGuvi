package firstjavaintroconcept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**************
 
 The issue in your code is related to string comparison. In Java, 
 you should use the equals method to compare strings instead of the == operator. 
 The == operator checks for reference equality, which means it checks
  if the two variables refer to the exact same object in memory. 
  The equals method, on the other hand, checks for content equality.
  
  string  comparison we should not use == (equal operator): if (arithmetic=="1")
  string  comparison we should use: equal method : if (arithmetic.equals("1"))

 */

/******
		System.out.println();---Meaning 
		===============================

Terminates the current line by writing the line separator string. 
Theline separator string is defined by the system property line.separator,
and is not necessarily a single newlinecharacter ('\n').
*********/


public class byusingifeslesstatement
{

	public static void main(String[] args) throws IOException
	{
		int a=10;
		int b=20;
		String options="1.Add\n  2.Subtraction\n  3.Multiplication\n  4.divide\n pls enter your options";
		System.out.println(options);
		try (BufferedReader reader=new BufferedReader(new InputStreamReader(System.in)))
		{
		String arithmetic=reader.readLine();
		if (arithmetic.equals("1"))
		{
		    System.out.println(a + b);
		}
		else if (arithmetic.equals("2"))
		{
		    System.out.println(a - b);
		}
		else if (arithmetic.equals("3"))
		{
		    System.out.println(a * b);
		}
		else if (arithmetic.equals("4"))
		{
		    System.out.println(a / b);
		}
		else
		{
		    System.out.println("Invalid option");
		}
		


	}

}
}
package firstjavaintroconcept;

import java.io.BufferedReader;

/*************
   break-------if we are not using break for  case,Then every statement will get executed 
 */
import java.io.IOException;
import java.io.InputStreamReader;

public class switchcasestatementreasonforusingstring 
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
			switch(arithmetic)
			{
			case "1":
			System.out.println(a+b);
			break;

			case "2":
			System.out.println(a-b);
			break;

			case "3":
			System.out.println(a*b);
			break;

			case "4":
			System.out.println(a/b);
			break;

			default:
			System.out.println("Invalid option");
			//break;
			}
			
	
                 }
		}

	}



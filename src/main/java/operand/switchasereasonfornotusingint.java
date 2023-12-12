package operand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*******************
 
  Now if you enter your options as 
  02
  still doing nd performing as operation,becaue of 01 is an integer where consider as 1 so performing arithemtic=10+20=30
  that is not correct thing to do.
  That's why we are using as string in case.
 
 */

public class switchasereasonfornotusingint {

	public static void main(String[] args) throws IOException {
		int a=10;
		int b=20;
		String options="1.Add\n  2.Subtraction\n  3.Multiplication\n  4.divide\n pls enter your options";
		System.out.println(options);
		try (BufferedReader reader=new BufferedReader(new InputStreamReader(System.in)))
                {
			int arithmetic=Integer.parseInt(reader.readLine());
			switch(arithmetic)
			{
			case 1:
			System.out.println(a+b);
			break;
			case 2:
			System.out.println(a-b);
			break;
			case 3:
			System.out.println(a*b);
			break;
			case 4:
			System.out.println(a/b);
			break;
			default:
			System.out.println("Invalid option");
			//break;
			}
			
	
                 }
		}



	}

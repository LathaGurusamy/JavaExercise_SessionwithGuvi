package firstjavaintroconcept;

//every keyword will be small case letter

/**Three Types of Control Statement
 * 1.Decision Making Statement
 * 2.Loop Statement
 * 3.Jump Statement
 * 
 
 * I.Decision Making Statement
 *    1.if else statement
 *    2.switch case statement
 * 
 *  II.Loop Statement
 *     1.while loop
 *     2.do while loop
 *     3.for loop
 *     4.for each loop

 * 
 * III..Jump Statement
 * 1.break statement
 * 2.continue statement
 */

public class controlstatement 
{

	public static void main(String[] args)
	{
		//Always line by line execution will happen
		int var1=30;
		System.out.println(var1);
        int var2=++var1;
		//++var;
		System.out.println(var2);
		printHello();

		String numberType= var2 % 2 ==0  ? "even" : "odd";
		System.out.println(numberType);
		
		/****
		 *if condition
		 =============
		 *if(condition)
		 *{
		 * if block
		 *}
		 *else
		 *{
		 *else block
		 *}
		 ****/
		
		/***
		 * else if condition
		 ===================
		 *if(condition)
		 *{
		 * if block
		 *}
		 *else if (another condition)
		 *{
		 *else block
		 *}
		 *else if (another condition)
		 *{
		 *else block
		 *}
		 *else if (another condition)
		 *{
		 *else block
		 *}
		 *else
		 *{
		 *else block
		 *}
		 *
		 ****/
		
		/*******
		 * switch case statement
		 * ======================
		 * switch(condition)
		 * {
		 * case a:
		 * whatever
		 * break;
		 * case b;
		 * whatever
		 * break;
		 * ----
		 * ----
		 * default:
		 * whatever
		 * break;
		 * }
		 
		 * 
		 ************/
		 
		 
		
		
		if(var2 % 2==0)
		{
			System.out.println("even");
		}
		else
			
		{
			System.out.println("odd");
		}
	}
	
	private static void printHello()
	{
		System.out.println("Hello");
	}
	
}


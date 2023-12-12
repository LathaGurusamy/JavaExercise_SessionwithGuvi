package firstexecutionprogram;

public class FirstProgam {

	public static void main(String[] args) 
	{
		
		//Keyword can not be used as a variable name
		//for ex:taking boolean 
		
		//String v="Latha G";
		
		//i am trying to enter keyword as a variable name
         //String bollean="Latha G";
		
		//---The value of the local variable keyword we can not not use ---//
		//---The value of the local method also  keyword is not use---//

		
		int a=15;
	
		System.out.println(a);
		
	
		String b="God always Great";
		System.out.println(b);
		tempname1("jack");
		tempname2(50.0,45);
		printGivenString("Prnt the  output");

	}
	
	private static void tempname1(String h)
	{
		System.out.println(h);
	}
	
	public static void tempname2(double a,double b)
	{
		double c=a+b;
		System.out.println(c);
		SecondProgram.accessProgram();
		//new SecondProgram().accessProgram();
	}
	
	//void means empty--void telling to complier Notheir is their for memory allocation.
	//null means it is not hold anything but it has a reference value.
	//null means There is a box but it is not pointing to any other things,if you are trying to perform actions 
	//on that box then will get null poiner exception if u are trying to perform concatinaton something like.
	//append to myname  will get null poiner exception
	
	
	public static boolean printGivenString(String e)
	{
		
		boolean var1=false;
		boolean var2=true;
		return var1 && var2;
		
		//Truth table for AND OPERATOR
		
		/**
		 * 0 0 0
		 * 0 1 0
		 * 1 0 0
		 * 1 1 1
		 * 
		 * 
		 */
		
		
		
		//Truth table for OR  OPERATOR
		
		/**
		 * 0 0 0
		 * 0 1 1
		 * 1 0 1
		 * 1 1 1
		 * 
		 * 
		 * 
		 * 
		 */
		
		//Truth table for XOR  OPERATOR
		
				/**
				 * 0 0 0
				 * 0 1 1
				 * 1 0 1
				 * 1 1 0
				 * 
				 * 
				 * 
				 * 
				 */
		
		//Truth table for NOT OPERATOR
				/**
				 * O 1
				 * 1 0
				 */

		

		

		//return a!=null;
		//return false;
		
	}
	
	
	

}

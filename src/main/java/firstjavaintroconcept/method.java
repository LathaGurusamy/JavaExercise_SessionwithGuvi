package firstjavaintroconcept;

public class method {

	public static void main(String[] args)
	
	
	{
		
		/**  Bit wise operator
		 * binary value for 16=10000

		 * binary value for 17=10001
		
		 **/
		System.out.println("16 & 17=" +(16 & 17));
		System.out.println("16 | 17=" +(16 | 17));
		System.out.println("18 | 19=" +(16 | 17));
		System.out.println("18 & 19=" +(16 | 17));




		printGivenString("Success");

	}
	
	
		public static boolean printGivenString(String e)
		{
			System.out.println(e);//To Print Success
			boolean var1=true;
			boolean var2=true;
			boolean c=var1 && var2;
			System.out.println(c);
			return c;
	
			//return true;
		}

}

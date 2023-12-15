package thirdaccessmodifiedconceptwithstatic;

public class Myclass1
{
/*********************
	 showing error as  Duplicate method publicMethod() in Type Myclass
	
	//Method name should not be duplicate.so i am going to change the each method name.
	
		public static void publicMethod()//Duplicate method publicMethod() in type Myclass1
		{
			System.out.println("public");
		}
		
		private static void publicMethod()//Duplicate method publicMethod() in type Myclass1
		{
			System.out.println("private");

		}
		
		
		protected static void publicMethod()//Duplicate method publicMethod() in type Myclass1
		{
			System.out.println("protected");

		}
		 *********************/
	
	public static void publicMethod()
	{
		System.out.println("public");
	}
	
	//Suppose if you want to access any private method then  method should be public

	private static void privateMethod()
	{
		System.out.println("private");

	}
	
	
	protected static void protectedMethod()
	{
		System.out.println("protected");

	}
	//default modifier using mainly package level.
	
	  

	
	
	//Suppose if you want to access any private method then below method should be public
    //Now I am able to access the method.since with the help of another public method trying to access private mehod.
	public static void  accessprivateMethod()
	{
		privateMethod();
	}

	 static void defaultMethod() 
	 {
			System.out.println("default");
		
	}

		
		
		
	
		


	}



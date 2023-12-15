package thirdaccessmodifiedconceptwithstatic;

import firstjavaintroconcept.method;

public class MyEntryPointClass1
{
	public static void main(String[] args)
	{
		//I am trying to access the method in Myclass1
		//Myclass1. afte entering this line just press ,
		//you could see protected and public()
		
		Myclass1.protectedMethod();//I am able to access this method because this is static.
		Myclass1.publicMethod();////I am able to access this method because this is static.
		Myclass1.defaultMethod();//I am able to access this method because this is static.

	//If  you trying to type publicMethod() and you could see the error .
		//private static void privateMethod()--This method only private to the Myclass1
		//Myclass1.privateMethod();//The method privateMethod() from the type Myclass1 is not visible
	
		
		//here I am not directly accessing the private method
	    //rather then i am accessing private method through  with the help of another method with the help of public method.
		Myclass1.accessprivateMethod();
	
	
	
	
	
	
	}
}


		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



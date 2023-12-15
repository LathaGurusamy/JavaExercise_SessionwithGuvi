package fourthaccessmodifiedconceptwithstatic;

import thirdaccessmodifiedconceptwithstatic.Myclass1;

public class MyEntryPointClass2
{
	
	public static void main(String[] args)
	
	{
		
		//Public method which is accessable everyone and  different package.
		
		//I can access only public method in different package.
		//I am not able to access-private,protected,default from different pakage.
		Myclass1.publicMethod();
		
	    //I am able to access the thismethod.
		//since with the help of another public method trying to access private mehod.

		Myclass1.accessprivateMethod();

	}
	

	

		
		
		
	
		


	}



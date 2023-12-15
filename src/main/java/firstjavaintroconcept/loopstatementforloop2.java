package firstjavaintroconcept;

public class loopstatementforloop2 {

	public static void main(String[] args)
	
	{
		/************************
		//go to console in that page  click on preference and uncheckthebox of  limit the console  then apply and save.
		 ===============================================================================================================
		 
		 //every time executing (Continuous Execution) we callled as iteration.
		 ===============================================
		 
		int a=5;
		
		//only one time first statement will get execute -only entry point statement
		//even last statemnet getting exceute since condition is true go inside.
		for(System.out.println("First statement");a%2==1;System.out.println("Last statement"))
		{
			System.out.println("Printing");//it getting excute since the condition is true

		}
		System.out.println("end");
		
		******************/
		
		/******************
		 * Below code i am not adding increment value of particular data sine only 0th iteration continously executing .
		 * since condition not satisfied continuosly executed.

		int i=0;
		while(i<10)
		{
			System.out.println(i+"th iteration");
		}
		
		******************/
		
		// * Below code i am  adding increment value of particular data sine up to condition satisefied   iteration executed.

		int i=0;
		while(i<=10)//when i==11 11<=10,confition getting failed then won't go inside loop and exit from the loop.
		{
			System.out.println(i+"th iteration");
			i++;
		}
		System.out.println("out of loop");
		
		
	}

}

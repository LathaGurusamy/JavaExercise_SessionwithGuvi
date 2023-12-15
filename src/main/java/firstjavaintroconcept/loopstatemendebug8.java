package firstjavaintroconcept;

public class loopstatemendebug8 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			printHello();
			//continue means skip the iteration 5<=5 untill below iteration wont execute,
			//it is going to execute next iteration of the loop.
			//continue means it is going to execute till last statement directly,
			//subseuent statemnt wont get exceute
			
			if (i<=5)
			{
				continue;
			}
			System.out.println(i+"th iteration");
			System.out.println(i+"th iteration");
			System.out.println(i+"th iteration");
			System.out.println(i+"th iteration");
			System.out.println(i+"th iteration");

			
		}
		System.out.println("out of loop");



	}
	
	private static void printHello() 
	{
		System.out.println("Helllo");

		
	}
	

	}



package firstjavaintroconcept;

public class loopstatemendebug7 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			printHello();
			if (i==5)
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



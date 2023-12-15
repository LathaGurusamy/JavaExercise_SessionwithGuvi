package firstjavaintroconcept;

public class loopstatemendebug3 {

	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"th iteration");
			printHello();
		}
		System.out.println("out of loop");



	}

	private static void printHello() 
	{
		System.out.println("Helllo");

		
	}

}

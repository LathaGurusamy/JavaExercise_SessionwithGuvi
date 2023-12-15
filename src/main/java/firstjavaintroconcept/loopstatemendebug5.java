package firstjavaintroconcept;

public class loopstatemendebug5 {

	public static void main(String[] args) 
	{
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"th iteration");
			printHello();
			if (i==5)
			{
				break;//if i=5,5=5 then i am going to breaking the condition & breaking the loop.
			}
		}
		System.out.println("out of loop");



	}
	
	private static void printHello() 
	{
		System.out.println("Helllo");

		
	}

}

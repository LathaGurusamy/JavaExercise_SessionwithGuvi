package firstjavaintroconcept;

public class loopstatemendebug4 {

	public static void main(String[] args) 
	{
		
			for(int i=1;i<=10;i++)
			{
				System.out.println(i+"th iteration");
				printHello();
				i++;
			}
			System.out.println("out of loop");



		}

		private static void printHello() 
		{
			System.out.println("Helllo");

			
		}


	

}

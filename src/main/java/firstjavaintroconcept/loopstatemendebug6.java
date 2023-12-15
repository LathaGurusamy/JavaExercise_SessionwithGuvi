package firstjavaintroconcept;

public class loopstatemendebug6 
{

	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			printHello();
			if (i==5)
			{
				continue;
			}
			//continue means whatever code written after continue ,That part will be skipped.
			//it is going to execute next iteration of the loop.
			//continue means it is going to execute till last statement directly,
			//subseuent statemnt wont get exceute
		
			
				System.out.println(i+"th iteration");
				
			



				//if i=5,5=5 then saying i am continue to the next iteration loop.
				////if i=5,5=5 then you are not coming out of loop,
				//but you are going to next iteration of the loop. 
			
		}
		System.out.println("out of loop");



	}
	
	private static void printHello() 
	{
		System.out.println("Helllo");

		
	}

	
}

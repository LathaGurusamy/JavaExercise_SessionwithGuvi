package firstjavaintroconcept;

public class loopstatemendebug2 {

	public static void main(String[] args)
	
	{
		

		int i=1;
		System.out.println("Checking after false whether printing is it.");
		
		//Always loop condition starting to ending will check within that
		//keep on checking. it won't focus above starting of code..
		//focus on condition loop
		do

		{
			System.out.println(i+"th iteration");
			i++;
			printHello();
			//Now if I am pressing f5 then will go inside the method -printHello()
            //Suppose if I am pressing f6 then it will not go inside printHello()
		}
		while(i<=10);
		System.out.println("out of loop");
		
		
	}
	
	public static void printHello()
	{
		System.out.println("Helllo");
	
		
	}

}

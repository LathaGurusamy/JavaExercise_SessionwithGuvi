package task1IntrductiontoJava;

public class FirstProgramSumofAddingcheckngGreatestNumber 
{

	public static void main(String[] args) {
		
		
		/*******************************
	Write a Java Program that declares four integer four integer variables:
	a,b,c, and d.Then,write an if statement that checks whether the sum of a and b 
	is greater than the sum of c and d.If the condition is true,the program should output 
	a message indicating that the sum of a and b is greater than the sum of c  and d.

	******/
		

		//output
	//The sum of a and b is greater than the sum of c and d.
		
		{

			        int a = 50;
			        int b = 50;
			        int c = 15;
			        int d = 56;
			        
			        int sum1=a+b;
			        int sum2=c+d;

			        if (sum1 > sum2) 
	                 {
			            System.out.println("The sum of a and b is greater than the sum of c and d.");
	                 }
			        else
			        {
			            System.out.println("The sum of a and b is not greater than the sum of c and d.");
			        }
			    }
	}
}





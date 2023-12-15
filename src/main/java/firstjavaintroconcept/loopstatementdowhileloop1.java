package firstjavaintroconcept;

public class loopstatementdowhileloop1 
{

	public static void main(String[] args) 
	{
		
		/************************
		 * 
		 * 
		 Below code condition is true,so it is continuosly executing
		 ===============================================================
		int a=5;
		do
		{
			System.out.println("printing");

		}while(a%2==1);  //here condition is true ,so keep on excuting inside the loop.
		System.out.println("end");


       *************/
		
		/************************
		 * 
		 * 
		 Below code condition is false,so exit from the loop.
		 ===============================================================
		
		int a=5;
		do
		{
			System.out.println("printing");

		}while(a%2==0);  //here condition is false ,so won't get executing inside loop instead of exit from the loop..
		System.out.println("end");
		
		
		*********************/

	}

}

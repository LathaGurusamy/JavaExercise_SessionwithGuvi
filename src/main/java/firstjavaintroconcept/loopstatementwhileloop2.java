package firstjavaintroconcept;


public class loopstatementwhileloop2 {
	public static void main(String[] args)
	{
		
		/************888
		 Below code called as Unreachable code or called as Dead code 
		 /
		//even while executng will get below error
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			Unreachable code
			
			
			
			*********/
		
		/***********************
		 
	Unreachable code or called as Dead code 
	========================================
		while(false)
		{
			System.out.println("printing");
		}
		********/
		
		
		/************************
		 * 
		 * 
		 Below code condition is true,so it is continuosly executing
		 ===========================================================
		int a=5;
		while(a%2==1)
		{
			System.out.println("printing");
		}
		******/
		
		/*************************
		 
		 
		 Below code condition is fclse,so it is nothing getting executing
		 ==========================================================
		   int a=5;
		while(a%2==0)
		{
			System.out.println("printing");
		}
		  
		  
		  *************/
		
		/***********************
		
		//Below case end output will come
		================================
		 int a=5;
		while(a%2==0)
		{
			System.out.println("printing");
		}
		 System.out.println("end");
		 
		 *******************/
		
/***********************
		
		//Below case end won't come,keep on executing printing output will come
		=======================================================================
		 int a=5;
			while(a%2==1)
			{
				System.out.println("printing");
			}
			 System.out.println("end");
			 
			 /***********************
		
		 *******************/
		 
		 
		
	}

}

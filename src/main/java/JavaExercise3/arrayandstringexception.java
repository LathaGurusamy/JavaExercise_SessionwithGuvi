package JavaExercise3;

public class arrayandstringexception 
{

	public static void main(String[] args) 
	{
	
	/**************************
	{
		
	 //Write a code of  ArrayIndexOutOfBoundsException & StringIndexOutOfBoundsException?
		
		/**************************
		 
		//ArrayIndexOutOfBoundsException
		===================================
		        int[] numbers = {1, 2, 3, 4, 5};

		        try {
		            // Attempt to access an element outside the array's bounds
		            int value = numbers[10];
		            System.out.println("Value: " + value);

		        } catch (ArrayIndexOutOfBoundsException e) {
		            // Handle the exception
		            System.err.println("Error: Array index out of bounds.");
		        }
		        
		        output:Error: Array index out of bounds.
		        
		        ***********************/
		/*********************************************
		
		//StringIndexOutOfBoundsException
		=================================
		
		
		        String text = "Hello, World!";

		        try {
		            // Attempt to access a character outside the string's bounds
		            char character = text.charAt(20);
		            System.out.println("Character: " + character);

		        } catch (StringIndexOutOfBoundsException e) {
		            // Handle the exception
		            System.err.println("Error: String index out of bounds.");
		        }
		        
		        
		
             ouput:Error: String index out of bounds.
	***********************/
	}
}

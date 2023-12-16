package JavaExercise3;

public class checkedexceptionanduncheckedexception {

	public static void main(String[] args) 
	{
		/**************************************
		 
		 //What is the difference between Checked Exception and Unchecked Exception?
		  
		  In Java, exceptions are categorized into two main types: checked exceptions and unchecked exceptions.
.
Checked Exceptions:(compile time Exceptions)
=================================================
Checked exceptions are exceptions that are checked at compile-time. This means that the Java compiler ensures that the code handling these exceptions is either provided or that the method explicitly declares that it may throw these exceptions.
Checked exceptions typically represent conditions that might occur during the execution of a program and that the programmer is expected to anticipate and handle.
Examples of checked exceptions in
===================================
clude IOException, SQLException, and ClassNotFoundException.
To handle checked exceptions, the code must be placed in a try-catch block or the method must declare that it throws the exception.
Example of handling a checked exception:
=======================================
try {
    FileReader file = new FileReader("example.txt");
    // Code that may throw FileNotFoundException
} catch (FileNotFoundException e) {
    // Handle the exception
}
Example of declaring a method that throws a checked exception:
===================================================================

public void readFile() throws FileNotFoundException {
    FileReader file = new FileReader("example.txt");
    // Code that may throw FileNotFoundException
}
Unchecked Exceptions (Runtime Exceptions):
=========================================
Unchecked exceptions, also known as runtime exceptions, are not checked at compile-time. The compiler does not enforce handling or declaring of unchecked exceptions.
Unchecked exceptions usually indicate programming errors or unexpected conditions that might occur during the execution of the program.
Examples of unchecked exceptions include NullPointerException, ArrayIndexOutOfBoundsException, and IllegalArgumentException.
While it is not mandatory to handle or declare unchecked exceptions, it is a good practice to do so if possible, to enhance the robustness of the code.
Example of an unchecked exception:
======================================
int[] array = new int[5];
int value = array[10]; // ArrayIndexOutOfBoundsException (Unchecked)
In summary, the key difference between checked and unchecked exceptions lies in 
when they are checked by the compiler. Checked exceptions are checked at compile-time,
 and the code must handle or declare them, while unchecked exceptions (runtime exceptions)
 are not checked at compile-time,  and handling or declaring them is optional but recommended for robust code.
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 */


	}

}

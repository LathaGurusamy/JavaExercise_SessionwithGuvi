package JavaExercise3;

public class excptionanderror {

	public static void main(String[] args)
	{
		/*************************************
		 
		 //What is the difference between Exception and Error?
		 
		 In Java (and in many programming languages), "Exception" and "Error" are both types of Throwable objects,
		  but they serve different purposes.
Exception:
===========
Exceptions are events that occur during the execution of a program that disrupts the normal flow of instructions.
Exceptions in Java are typically caused by the application's code and are meant to be caught and handled by the program.
Exceptions are divided into two main categories: checked exceptions and unchecked exceptions.
Checked exceptions are those that are checked at compile-time, and the programmer is required to handle them (using try-catch blocks) or declare that the method throws them.
Unchecked exceptions, also known as runtime exceptions, are not checked at compile-time. They usually indicate programming errors (e.g., NullPointerException, ArrayIndexOutOfBoundsException) and can be caught if desired.

Error:
========
Errors, on the other hand, are events that occur outside the control of the programmer and typically indicate serious problems that cannot be easily recovered.
Unlike exceptions, errors are not meant to be caught and handled by the application.
 They usually represent problems at a system level or virtual machine level, and they may lead to the termination of the program.
Examples of errors include OutOfMemoryError, StackOverflowError, and LinkageError.

In summary, exceptions are meant to be caught and handled by the application to ensure graceful error recovery, 
while errors are typically severe issues that may lead to program termination and are not expected to be caught or handled by the program.
		 
		 *********************/

	}

}

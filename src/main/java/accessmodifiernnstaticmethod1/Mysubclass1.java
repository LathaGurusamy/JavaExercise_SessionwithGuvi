package accessmodifiernnstaticmethod1;

public class Mysubclass1 extends MyClass1 
{
	
	public static void main(String[] args)
	{
	
	
		
		
		/******
		 * 
		 * System.out.println("Something");
		
		
		MyClass1 classObject = new MyClass1();

		classObject.publicMethod();
		classObject.accessPrivateMethod();
		classObject.protectedMethod();
		above code what happened
		I got output pubilc ,private not getting protected,Something
		Main reason for that,I have created a new instance of MyClass1, 
		which is not an instance of the subclass Mysubclass1. 
		how to resolve by creating the object to call super class as well as.
		 Answer
		 =========
		 If you want to create an object that is an instance of both the superclass MyClass1 and the subclass Mysubclass1,
		 In this case, Mysubclass1 is both a subclass of MyClass1 and its own type. 
		 So, you create an instance of Mysubclass1 (Mysubclass1 subclassObject = new Mysubclass1();) 
		  use it to access methods from both the superclass and the subclass.
		  also we need to use main method Ensure that the main method 
		  	public static void main(String[] args)

		 
		***********/
		
		// Create an object of the subclass
		System.out.println("Something");
        Mysubclass1 subclassObject = new Mysubclass1();

        // Access methods from the superclass
        subclassObject.publicMethod();
        subclassObject.accessPrivateMethod();
        subclassObject.protectedMethod();
		
		
		
	}
	

}


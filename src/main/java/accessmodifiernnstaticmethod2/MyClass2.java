package accessmodifiernnstaticmethod2;

import accessmodifiernnstaticmethod1.MyClass1;

public class MyClass2 
{
	public static void main(String[] args)
	{
	
		System.out.println("something");
	
	
    //apart from below method ,I can not access any method..
	//private can access only within class ,
   //since calling private method by using another method able to call,private method
		
		//protected meaning -is It is accessable only for the subclass in which inherit from parent class 
		//within same package  also different package.
		//That's why here not accessable.
		
		//Non static meaning is mandatory to create on object.
		MyClass1 classObject = new MyClass1();
		classObject.publicMethod();
		classObject.accessPrivateMethod();
		
		//Static means not required to create on object.
		//with the help of class name we can call the variable/method.
		System.out.println(MyClass1.myVariable); 
		
		/*********
		 Static means 
		 It is like a road where the car's run.Car like a template.
		 We can create "n" number of car's.
		 But the road is common for all.
		 
		 
		 
		 ***************/
		
  	}
}




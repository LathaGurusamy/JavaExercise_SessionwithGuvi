package accessmodifiernnstaticmethod2;

import accessmodifiernnstaticmethod1.MyClass1;

public class MySubClass2 extends MyClass1
{

	public static void main(String[] args)

	{
		//If you are creating object of sub class
		//then we can able to access protected()
		MySubClass2 classObject = new MySubClass2();
		classObject.publicMethod();
		classObject.accessPrivateMethod();
		classObject.protectedMethod();
		
		//Supose if you are creating of object super class 
		//then we can not  able to access protected()
		MyClass1 classObject1=new MyClass1();
		classObject1.publicMethod();
		classObject1.accessPrivateMethod();
		//classObject1.protectedMethod();//The method protectedMethod() from the type MyClass1 is not visible

		//protected method we can  access even  if it is different package 
		//should inherit from sub class.
		//default method we can not access if it is different package.
		//public we can use anywhere
		//private only within same class
		//super keyword is used to invoke anything from the parent.
		
				
		
		//protected method we can access even  if it is different package.
        
		//super keyword is used to invoke anything from the parent.
       // super.accessPrivateMethod();//Cannot use super in a static context
		//super.protectedMethod();//Cannot use super in a static context
		//super.publicMethod();//Cannot use super in a static context

		
	}

}

package accessmodifiernnstaticmethod1;

public class MyClass1 {
	
	public static  int myVariable = 10;

	public void publicMethod() 
	{
		System.out.println("public");
	}

	private  void privateMethod() {
		System.out.println("private");
	}

	protected void protectedMethod() {
		System.out.println("protected");
	}
	
	public void accessPrivateMethod() {
		privateMethod();
	}
	 
	  static void defaultMethod() {
		 System.out.println("default");
	 }

}

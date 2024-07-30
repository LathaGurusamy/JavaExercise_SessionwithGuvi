package task31OopsConcept;

import JavaExercise5.person;

public class FirstProgramPersonNameAgeCreate 
{
	
	 // Attributes
    private String name;
    private int age;

    // Constructor
    public FirstProgramPersonNameAgeCreate(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Create an instance of Person
    	person man = new person("John Doe", 25);

        // Access attributes using getter methods
        System.out.println("Person Name: " + man.getName());
        System.out.println("Person Age: " + man.getAge());
    }
}


/*********************
 Output:
 =======
Person Name: John Doe
Person Age: 25
  
 *******************/
 


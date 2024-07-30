package task33OopsConcept;

import JavaExercise5.radiuscircum.Circle;

public class ThirdProgramcalculateradiuscircum {

	public static void main(String[] args)
	{
		 // Creating an instance of the outer class
        ThirdProgramradiuscircum outerInstance = new ThirdProgramradiuscircum();

        // Creating a circle with default radius (1)
        ThirdProgramradiuscircum.Circle circle1 = outerInstance.new Circle();
        System.out.println("Circle 1 - Radius: " + circle1.getRadius());
        System.out.println("Circle 1 - Circumference: " + circle1.calculateCircumference());

        // Creating a circle with radius 5
        ThirdProgramradiuscircum.Circle circle2 = outerInstance.new Circle(5);
        System.out.println("\nCircle 2 - Radius: " + circle2.getRadius());
        System.out.println("Circle 2 - Circumference: " + circle2.calculateCircumference());
    }
}

/************************************
 Circle 1 - Radius: 1.0
Circle 1 - Circumference: 6.283185307179586

Circle 2 - Radius: 5.0
Circle 2 - Circumference: 31.41592653589793

 */


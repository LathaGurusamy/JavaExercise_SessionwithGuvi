package JavaExercise5;

import JavaExercise5.radiuscircum.Circle;

public class calculateradiuscircum {

	public static void main(String[] args)
	{
		 // Creating an instance of the outer class
        radiuscircum outerInstance = new radiuscircum();

        // Creating a circle with default radius (1)
        radiuscircum.Circle circle1 = outerInstance.new Circle();
        System.out.println("Circle 1 - Radius: " + circle1.getRadius());
        System.out.println("Circle 1 - Circumference: " + circle1.calculateCircumference());

        // Creating a circle with radius 5
        radiuscircum.Circle circle2 = outerInstance.new Circle(5);
        System.out.println("\nCircle 2 - Radius: " + circle2.getRadius());
        System.out.println("Circle 2 - Circumference: " + circle2.calculateCircumference());
    }
}




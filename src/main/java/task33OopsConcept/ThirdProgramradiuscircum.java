package task33OopsConcept;


public class ThirdProgramradiuscircum {
    public class Circle {
        private double radius;

        // Constructors and methods for Circle go here...

        // Example of a constructor
        public Circle() {
            this.radius = 1;
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public double calculateCircumference() {
            //return 2 * Math.PI * this.radius;
        	double circumference = 2 * Math.PI * this.radius;
            return circumference;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
    }
}



   

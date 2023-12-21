package JavaExercise5;

public class employee {

    // Attributes
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter method for ID
    public int getID() {
        return id;
    }

    // Getter method for firstName
    public String getFirstName() {
        return firstName;
    }

    // Getter method for lastName
    public String getLastName() {
        return lastName;
    }

    // Getter method for name (formatted as "firstName lastName")
    public String getName() {
        return firstName + " " + lastName;
    }

    // Getter method for salary
    public int getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Getter method for annual salary
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Method to raise the salary by a specified percentage
    public int raiseSalary(int percent) {
        double percentage = 1 + (percent / 100.0);
        salary = (int) (salary * percentage);
        return salary;
    }

    // toString method to represent the Employee object as a string
    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }

    public static void main(String[] args) {
        // Create an instance of Employee
        employee employee = new employee(1, "John", "Doe", 50000);

        // Display employee information
        System.out.println("Employee ID: " + employee.getID());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: " + employee.getSalary());

        // Raise the salary by 10%
        employee.raiseSalary(10);

        // Display updated employee information
        System.out.println("Updated Employee Salary: " + employee.getSalary());

        // Display annual salary
        System.out.println("Employee Annual Salary: " + employee.getAnnualSalary());

        // Display employee information using toString method
        System.out.println("Employee Information: " + employee.toString());
    }
}

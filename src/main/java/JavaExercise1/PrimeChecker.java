package JavaExercise1;
import java.util.Scanner;


public class PrimeChecker
{
	//Write program to check if a number is prime or not?

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false; // not a prime number
            }
        }

        return true; //it's a prime number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();

        if (isPrime(userNumber)) {
            System.out.println(userNumber + " is a prime number.");
        } else {
            System.out.println(userNumber + " is not a prime number.");
        }

        //scanner.close();
    }
}
//output
//Enter a number: 45
//45 is not a prime number.

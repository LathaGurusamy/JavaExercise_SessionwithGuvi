package JavaExercise2;
import java.util.Scanner;

public class hoteltariffcalculate 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input: Month, Room Rent, Number of Days
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the room rent per day: ");
        double roomRent = scanner.nextDouble();

        System.out.print("Enter the number of days stayed: ");
        int numDays = scanner.nextInt();

        // Calculate hotel tariff
        double tariff = calculateTariff(month, roomRent, numDays);

        // Output the result with 2 decimal places
        System.out.printf("Hotel tariff to be paid: %.2f\n", tariff);

        scanner.close();
    }

    private static double calculateTariff(int month, double roomRent, int numDays) 
    {

        double tariff;

        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                // 20% high during peak seasons
                tariff = roomRent * numDays * 1.2;
                break;
            default:
                tariff = roomRent * numDays;
                break;
        }

        return tariff;
    }
}


/*************************
Enter the month (1-12): 3
Enter the room rent per day: 1500
Enter the number of days stayed: 2
Hotel tariff to be paid: 3000.00
*********/
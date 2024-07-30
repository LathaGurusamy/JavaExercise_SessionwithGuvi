package task34OopsConcept;

public class FourthProgramaccount
{
	private double balance;

    public FourthProgramaccount() {
        this.balance = 0.0; // Default balance is set to 0 if not provided
    }

    // Constructor with two arguments
    public FourthProgramaccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to deposit into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

}

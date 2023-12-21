package JavaExercise5;

public class calculatewithdrawdeposit {

	public static void main(String[] args) 
	{
		account account1 = new account();
        System.out.println("Account 1 - Initial Balance: " + account1.getBalance());

        // Depositing into the account
        account1.deposit(100.0);
        System.out.println("Account 1 - Current Balance: " + account1.getBalance());

        // Withdrawing from the account
        account1.withdraw(30.0);
        System.out.println("Account 1 - Updated Balance: " + account1.getBalance());

        // Creating an account with initial balance
        account account2 = new account(500.0);
        System.out.println("\nAccount 2 - Initial Balance: " + account2.getBalance());

        // Withdrawing from the second account
        account2.withdraw(200.0);
        System.out.println("Account 2 - Updated Balance: " + account2.getBalance());
    }
}



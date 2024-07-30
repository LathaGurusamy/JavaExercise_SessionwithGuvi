package task34OopsConcept;

public class FourthProgramcalculatewithdrawdeposit {

	public static void main(String[] args) 
	{
		FourthProgramaccount account1 = new FourthProgramaccount();
        System.out.println("Account 1 - Initial Balance: " + account1.getBalance());

        // Depositing into the account
        account1.deposit(100.0);
        System.out.println("Account 1 - Current Balance: " + account1.getBalance());

        // Withdrawing from the account
        account1.withdraw(30.0);
        System.out.println("Account 1 - Updated Balance: " + account1.getBalance());

        // Creating an account with initial balance
        FourthProgramaccount account2 = new FourthProgramaccount(500.0);
        System.out.println("\nAccount 2 - Initial Balance: " + account2.getBalance());

        // Withdrawing from the second account
        account2.withdraw(200.0);
        System.out.println("Account 2 - Updated Balance: " + account2.getBalance());
    }
}


/************************************************************
Account 1 - Initial Balance: 0.0
Deposit successful. New balance: 100.0
Account 1 - Current Balance: 100.0
Withdrawal successful. Remaining balance: 70.0
Account 1 - Updated Balance: 70.0

Account 2 - Initial Balance: 500.0
Withdrawal successful. Remaining balance: 300.0
Account 2 - Updated Balance: 300.0

 **********/

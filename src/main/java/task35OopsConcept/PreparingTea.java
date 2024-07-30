package task35OopsConcept;

public class PreparingTea {

	public static void main(String[] args)
	{
		        Tea myTea = new Tea();

		        //Prepare basic tea
		       myTea.prepareTea();

		        // Add milk
		       myTea.addMilk();

		        // Add sugar
		        myTea.addSugar();
		        
		     // Creating instances of each type of tea
		        blackTea blackTea = new blackTea();
		        greenTea greenTea = new greenTea();
		        herbaltea herbalTea = new herbaltea();

		        // Prepare and display each type of tea
		        System.out.println("\nPreparing Black Tea:");
		        blackTea.prepareTea();

		        System.out.println("\nPreparing Green Tea:");
		        greenTea.prepareTea();

		        System.out.println("\nPreparing Herbal Tea:");
		        herbalTea.prepareTea();
		        
		       // Creating an array of Tea objects
		        Tea[] teas = {
		            new Tea(),
		            new blackTea(),
		            new greenTea(),
		            new herbaltea()
		        };

		        // Loop through the array and prepare each tea
		        for (Tea tea : teas) {
		            System.out.println("\nPreparing Tea:");
		            tea.prepareTea();

		            // Adding milk and sugar to each tea
		            tea.addMilk();
		            tea.addSugar();
		        }
		        
		    }
}

/***************************************
 * Preparing basic tea with hot water and tea leaves.
Adding milk to the tea.
Adding sugar to the tea.

Preparing Black Tea:
Preparing basic tea with hot water and tea leaves.
Adding black tea leaves and brewing for 3 minutes.

Preparing Green Tea:
Preparing basic tea with hot water and tea leaves.
Adding green tea leaves and brewing for 2 minutes.

Preparing Herbal Tea:
Preparing basic tea with hot water and tea leaves.
Adding herbal tea ingredients and brewing for 5 minutes.

Preparing Tea:
Preparing basic tea with hot water and tea leaves.
Adding milk to the tea.
Adding sugar to the tea.

Preparing Tea:
Preparing basic tea with hot water and tea leaves.
Adding black tea leaves and brewing for 3 minutes.
Adding milk to the tea.
Adding sugar to the tea.

Preparing Tea:
Preparing basic tea with hot water and tea leaves.
Adding green tea leaves and brewing for 2 minutes.
Adding milk to the tea.
Adding sugar to the tea.

Preparing Tea:
Preparing basic tea with hot water and tea leaves.
Adding herbal tea ingredients and brewing for 5 minutes.
Adding milk to the tea.
Adding sugar to the tea.


 *****/



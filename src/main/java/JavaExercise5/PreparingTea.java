package JavaExercise5;






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


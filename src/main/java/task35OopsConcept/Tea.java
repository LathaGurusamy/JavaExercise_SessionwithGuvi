package task35OopsConcept;

public class Tea 
{
	    private boolean prepared;
	    private boolean milkAdded;
	    private boolean sugarAdded;

	    // Constructor to initialize the tea preparation status
	    public Tea() {
	        this.prepared = false;
	        this.milkAdded = false;
	        this.sugarAdded = false;
	    }

	    // Method to prepare basic tea with hot water and tea leaves
	    public void prepareTea() {
	        if (!prepared) {
	            System.out.println("Preparing basic tea with hot water and tea leaves.");
	            prepared = true;
	        } else {
	            System.out.println("Tea is already prepared.");
	        }
	    }

	    // Method to add milk to the tea
	    public void addMilk() {
	        if (prepared && !milkAdded) {
	            System.out.println("Adding milk to the tea.");
	            milkAdded = true;
	        } else if (!prepared) {
	            System.out.println("Tea needs to be prepared first before adding milk.");
	        } else {
	            System.out.println("Milk is already added to the tea.");
	        }
	    }

	    // Method to add sugar to the tea
	    public void addSugar() {
	        if (prepared && !sugarAdded) {
	            System.out.println("Adding sugar to the tea.");
	            sugarAdded = true;
	        } else if (!prepared) {
	            System.out.println("Tea needs to be prepared first before adding sugar.");
	        } else {
	            System.out.println("Sugar is already added to the tea.");
	        }
	    }

	 
	    }




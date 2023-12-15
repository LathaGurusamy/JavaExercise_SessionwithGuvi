package secondarrayconcept;

public class basicarrayconcept2 {

	public static void main(String[] args)
    {
		 int[] myarray = {10, 20, 50, 65, 15, 24, 94};
		 
		 for(int i=0;i<myarray.length;i++)
         {
        	 System.out.println(myarray[i]);
        	 //The index of the inside elements of the array will check in for loop.
        	 //This will break the after the index  of 3.so up to 65 will print
        	 if (i==3)
        	 {
        		 break;
        	 }
        	 
         }
		 
		 
		 for (int i : myarray)
         {
        	 System.out.println(i);
        	 //The value of the inside elements of the array will check in for each loop.
        	 //This will break the after the value of 50,so up to 50 will print
        	 if (i==50)
        	 {
        		 break;
        	 }
         }


	}

}

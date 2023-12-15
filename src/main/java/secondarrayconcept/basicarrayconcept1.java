package secondarrayconcept;

import java.util.Arrays;

public class basicarrayconcept1 {

	public static void main(String[] args)
	//Array is a group of elements and belonging to the single datatype.
	
	//all is held by sigle variable like {10, 20, 50, 65, 15, 24, 94}--all this held by single variable ( data).
	//store multiple values in a single varible.
	{
                 int[] myarray = {10, 20, 50, 65, 15, 24, 94};
                // System.out.println(Arrays.toString(arry));
                 
                 //Array index always start from zero to N-1
                 //index stars from (zero to N-1)---0 to (7-1)=6 ==0 to 6
                 //N is a Total Number of elements
                 //[I@15db9742--This  is address of particular array-data
                 System.out.println(myarray[0]);
                 System.out.println(myarray[1]);
                 System.out.println(myarray);//This  is address of particular array(data).
                 
                 for(int i=0;i<myarray.length;i++)
                 {
                	 System.out.println(myarray[i]);//I am trying to print the each elements of array.
                	 
                 }
                 
                 //below for each loop explanation:For every elements of array( myarray) poiting to int type (int i).
                 //for each elements of  values in ths array(myarray) assigned to a int type values (int i) in every iteration.
                 for (int i : myarray)
                 {
                	 System.out.println(i);
                 }
                 

	}
	
	

}

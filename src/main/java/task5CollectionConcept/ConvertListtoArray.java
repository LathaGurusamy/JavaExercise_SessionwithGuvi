package task5CollectionConcept;

import java.util.ArrayList;

public class ConvertListtoArray {

	public static void main(String[] args) {

		 ArrayList<String> sampleList = new ArrayList<String>();

	        sampleList.add("California");
	        sampleList.add("Texas");
	        sampleList.add("Illinois");
	        sampleList.add("Massachusetts");
	        sampleList.add("Florida");
	        sampleList.add("Virginia");
	        sampleList.add("Colorado");


	        System.out.println("Elements of List: " + sampleList);

	        String[]arr = new String [sampleList.size()];

	        sampleList.toArray(arr);

	        System.out.print("Elements of Array: ");
	        for (int i = 0 ; i < arr.length ; i++){
	            System.out.print(arr[i] + "  ");
	        }
	    }
	}

/****************

Elements of List: [California, Texas, Illinois, Massachusetts, Florida, Virginia, Colorado]
Elements of Array: California  Texas  Illinois  Massachusetts  Florida  Virginia  Colorado  
**********/
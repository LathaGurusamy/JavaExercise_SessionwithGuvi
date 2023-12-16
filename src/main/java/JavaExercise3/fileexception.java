package JavaExercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileexception {

	public static void main(String[] args) 
	{
   //8.Implement exception handling in a Java program that reads data from a file,
   //If the file does not exist.throw a "FileNotFoundException" and displa an error message to the user.

		// Specify the path to the file (replace "path/to/your/file.txt" with the actual file path)
		//String filePath = "D:\\Latha\\FederalDoc.txt";//output came 
		String filePath ="path\\not specity.txt";

		try {
		    File file = new File(filePath);

		    if (!file.exists()) {
		        throw new FileNotFoundException("File not found: " + filePath);
		    }

		    Scanner scanner = new Scanner(file);

		    while (scanner.hasNextLine()) {
		        String line = scanner.nextLine();
		        System.out.println(line);
		    }

		    scanner.close();

		} catch (FileNotFoundException e) {
		    System.err.println("Error: " + e.getMessage());
		} catch (Exception e) {
		    // Handle other exceptions, if any
		    System.err.println("An error occurred: " + e.getMessage());
		}

	}

}


//output1:
//above file output came proper ,whatevr present inside FederalDoc.txt everything saw as a output in console page.
//output2:
//Error: File not found: path\not specity.txt

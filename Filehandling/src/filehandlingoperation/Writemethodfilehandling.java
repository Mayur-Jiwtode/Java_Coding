package filehandlingoperation;

import java.io.FileWriter;
import java.util.Scanner;

public class Writemethodfilehandling {

	public static void main(String[] args) 
	{
		
//		String data = "This is the data in the newfile\n"
//				       + "My name is Mayur \n"
//				       + "I am a Java Developer";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data ");
		String data = sc.next();

		try 
		{     
			//create an object to write the file
			//Already created one
			
			FileWriter output = new FileWriter("newfile.txt");
			output.write(data);
			System.out.println("Data is written and stored in the file");
			//close the file
			output.close();
			sc.close();
		}
		catch(Exception e) 
		{
			e.getStackTrace();
		}

	}

}

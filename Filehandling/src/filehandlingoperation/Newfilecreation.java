package filehandlingoperation;

import java.io.File;

public class Newfilecreation
{
   public static void main( String[] args )
   {	
      try {
    	  
	     File file = new File("newfile.txt");
	     
	      /*If file gets created then the createNewFile() 
	      * method would return true or if the file is 
	      * already present it would return false
	      */
         boolean value = file.createNewFile();
         
	     if (value)
	     {
	          System.out.println("File has been created successfully");
	     }
	     else
	     {
	          System.out.println("File already present at the specified location");
	     }
	} 
      catch (Exception e)
      {
    		System.out.println("Exception Occurred:");
	     
	  }
   }
}
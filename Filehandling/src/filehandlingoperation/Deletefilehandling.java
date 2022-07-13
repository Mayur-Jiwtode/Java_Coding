package filehandlingoperation;


//Java program to delete a file
import java.io.*;

public class Deletefilehandling 
{
public static void main(String[] args)
{
 File file = new File("newfile.txt");

 if (file.delete()) 
 {
   System.out.println("File deleted successfully: "+file.getName());
 }
 else {
   System.out.println("Failed to delete the file");
 }
}
}

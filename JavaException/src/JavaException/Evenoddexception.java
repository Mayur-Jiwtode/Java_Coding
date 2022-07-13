package JavaException;
import java.util.Scanner;
class Evenoddexception
{
  public static void main(String args[])
  {
    try
    {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
        
        sc.close();
    }
    catch(Exception ex) {
    	
    	System.out.println("Warning!! You have entered the string instead of integer");
    	
    }
    finally 
    {
    	System.out.println("I am always there!");
    }
   
  }
 
}
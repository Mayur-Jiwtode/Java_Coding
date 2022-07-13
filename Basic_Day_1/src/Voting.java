import java.util.*;
public class Voting {

	public static void main(String[] args) 
	{
		  Scanner input = new Scanner(System.in);
	      System.out.println("Enter your age: ");
	      int age=input.nextInt();
	      if(age>=18)
	      {
	          System.out.println("Congratulation ,You are eligible for Voting");
	      }
	      else
	      {
	          System.out.println(" Sorry , You are not eligible for voting");
	      }   
	      
	      input.close();
	}

}

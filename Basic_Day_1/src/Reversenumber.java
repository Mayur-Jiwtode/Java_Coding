import java.util.*;
public class Reversenumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the grater than 4 digit");
		Scanner input = new Scanner(System.in);
		int num= input.nextInt();
		int reversed = 0;
		
		    for(;num != 0; num /= 10) 
		    {
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;
		    }

		    System.out.println("Reversed Number : " + reversed);
		    input.close();
	}

}

import java.util.*;
public class palindrome {

	public static void main(String[] args)
	{
		int reversedNum = 0, remainder;
		System.out.println("Please enter number:");

		Scanner input = new Scanner(System.in);
		int num= input.nextInt();
	    int originalNum = num;
	    
	    while (num != 0) 
	    {
	      remainder = num % 10;
	      reversedNum = reversedNum * 10 + remainder;
	      num /= 10;
	    }
	    
	    if (originalNum == reversedNum) {
	      System.out.println(originalNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(originalNum + " is not Palindrome.");
	    }
	    
	    
	    
	    System.out.println("Please enter string:");
	    String str = input.next();
	    int strLength = str.length();
	    String reverseStr = "";

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
	input.close();

	}
	  
}

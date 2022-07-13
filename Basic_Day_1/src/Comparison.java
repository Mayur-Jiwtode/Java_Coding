import java.util.*;
public class Comparison {

	public static void main(String[] args)
	{
		int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        num1 = input.nextInt();
        System.out.print("Enter the second number:");
        num2 = input.nextInt();
        if(num1 == num2)
        {
            System.out.println(num1+" and "+num2+" are equal ");
        }
        else
        {
            System.out.println(num1+" and "+num2+" are not equal ");
        }
       
       input.close();

	}

}

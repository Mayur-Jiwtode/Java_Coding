import java.util.*;
public class Categerized {

	public static void main(String[] args){
		System.out.println("Please enter your age:");

		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if (age >= 0 && age <=10)
		{
		   System.out.println("You are a Kid");

		} else if (age >= 11 && age <= 20) {
			System.out.println("Yoe are a Teenager");

		} else if (age >= 25 && age <= 50) {
			System.out.println("You are adult");

		} else if (age >= 51 && age <=100)
		{
			System.out.println("You are getting old");
			
		}else{
			System.out.println(" uncategerized...Are You alien! ");

		}
		
		input.close();

	}

}

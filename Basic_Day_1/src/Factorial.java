
public class Factorial {
	
	public static int fact(int num) {
		if (num==1)
		{
			return num;
		}
		else {
			return (num*fact(num-1));
		}
		
	}

	public static void main(String[] args) 
	{
		int num = 5;
		System.out.println(" factorial of "+ num +" is "+fact(num));
		
	}

}

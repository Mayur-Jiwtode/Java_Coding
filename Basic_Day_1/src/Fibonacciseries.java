
public class Fibonacciseries {
	
	public static int fibonacciRecursion(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		if(n == 1 || n == 2)
		{
			return 1;
		}
		else 
		{
			return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
		}
		}

	public static void main(String[] args) 
	{
		int num_count = 10;
		System.out.print("Fibonacci Series of "+ num_count +" numbers: ");
		for(int i = 0; i < num_count; i++)
		{
				System.out.print(fibonacciRecursion(i) +" ");
		}
		}
	}


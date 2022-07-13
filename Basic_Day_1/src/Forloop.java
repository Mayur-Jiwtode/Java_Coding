
public class Forloop {

	public static void main(String[] args) {
		
		for (int k=5; k>=1;k--)
		{
			for (int j=5;j>=k;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	System.out.println("---------------------------------------------");
		
		for (int k=1; k<=5;k++)
		{
			for (int j=5;j>=k;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//outer loop
		for (int j=1;j<=5;j++) {
			//inner loop
			for (int k=1;k<=5;k++)
			{
				if (j==2 &&k==2)
				{
					break;
				}
				System.out.println(j+" "+k);
			}
		}
		
		
	}

}

package JavaException;

public class Exceptionexampletwo{
	   public static void main(String args[]){
	     try{
	         int a[]=new int[7];
	         a[0]=0;
	         a[1]=1;
	         a[2]=2;
	         a[3]=3;
	         a[10]=10;
	         System.out.println("First print statement in try block");
	     }
	     catch(ArithmeticException e){
	        System.out.println("Warning: ArithmeticException");
	     }
	     catch(ArrayIndexOutOfBoundsException e){
	        System.out.println("Warning: ArrayIndexOutOfBoundsException");
	     }
	     catch(Exception e)
	     {
	        System.out.println("Warning: Some Other exception");
	     }
	   System.out.println("Out of try-catch block...");
	  }
	}
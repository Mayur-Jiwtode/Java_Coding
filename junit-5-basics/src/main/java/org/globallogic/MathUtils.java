package org.globallogic;

public class MathUtils 
{
	//Lets create method
	
	public int add(int numone,int numtwo)
	{
		return numone+numtwo;
	}
	
	public  int  mul(int  numone,int numtwo)
	{
		return numone*numtwo;
	}
	
	public  String even_or_odd(int number)
	{
		return number%2==0 ? "Even" : "Odd";
	    
	}
	public int divide(int numone,int numtwo)
	{
		return numone/numtwo;
		
	}
}

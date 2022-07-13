package Unittesting;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Unittestingimplementation 
{
	    //method
	    @Test	
		public void check()
			{
				int expected =20;
			    int actual = Math.addExact(12,8);
				//test method to perform unit testing 
				assertEquals(actual,expected);
			}
	    public void checktwo()
	    {
	    	
	    }

	public static void main(String[] args) 
	{
		
		System.out.println("Testing is good ");

	}

}

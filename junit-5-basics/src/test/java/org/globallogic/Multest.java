package org.globallogic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class Multest {
	
	@Test	
	public void checkmul()
		{
    	    MathUtils objtwo = new MathUtils();
     	    int  actualmul =18;
    	    int  expected = objtwo.mul(6,3);
//			test method to perform unit testing 
    	    assertEquals(actualmul,expected);
			System.out.println("Actual = 18, expected=18");
		}

	@Test
	public void testdevide() 
	{
		final MathUtils mathutils = new MathUtils();
		assertThrows(ArithmeticException.class,()-> mathutils.divide(10, 0));
	}
	
	@Test
	public void testmul() 
	{
		final MathUtils mathutils = new MathUtils();
		assertThrows(Exception.class,()-> mathutils.mul(10, 9));
	}
	
}

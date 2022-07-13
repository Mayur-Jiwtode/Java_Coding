package org.globallogic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class MathUtilsTest
{
	//Wrapper object
	MathUtils mathUtils;
	
	//Initialize the object for the class
	
	//@BeforeEach
	public void init()
	{
		mathUtils = new MathUtils();
	}
	@BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }
     
    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }
    
    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }
     
    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
    }
	
    @Test	
	public void check()
		{
    	    MathUtils mathUtils = new MathUtils();
			int expected =20;
		    int actual = mathUtils.add(10, 10);
			//test method to perform unit testing 
			assertEquals(actual,expected);
			System.out.println("expected is 20 and actual is also 20");
		}
		
	@Test
	 public void testEvenOrOdd() 
		{
		    MathUtils mathUtils= new MathUtils();
	        assertEquals(mathUtils.even_or_odd(6), "Even");
	        assertEquals(mathUtils.even_or_odd(7), "Odd");   
	        System.out.println("Both condition run successfully");
	        
	    }
 
}

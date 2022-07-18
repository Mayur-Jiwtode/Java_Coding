package org.Globallogic.Springcore.Springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
  
	public static void main( String[] args )
    {
    	// create and configure beans
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
    	
    	//Dependency Injection-Mechanism
    	//left side student is the name of the class
    	//Same-wise as we know constructor name should be as same as class name 
    	//hence we consider the right side class name -Student 
		
    	Student studentone =(Student) context.getBean("StudentOne");
    	Student studenttwo=(Student) context.getBean("StudentTwo");
    	System.out.println(studentone);
    	System.out.println(studenttwo);
    }
}

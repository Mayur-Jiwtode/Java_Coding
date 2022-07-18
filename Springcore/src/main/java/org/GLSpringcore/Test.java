package org.GLSpringcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args)
	{
					// create and configure beans
					@SuppressWarnings("resource")
					ApplicationContext context = new ClassPathXmlApplicationContext("configEmp.xml");
			    	//Dependency Injection-Mechanism
			    	//left side student is the name of the class
			    	//Same-wise as we know constructor name should be as same as class name 
			    	//hence we consider the right side class name -Student 
					
				    Employee obj = (Employee) context.getBean("Employeeone");
				    System.out.println(obj);
		
	}

}

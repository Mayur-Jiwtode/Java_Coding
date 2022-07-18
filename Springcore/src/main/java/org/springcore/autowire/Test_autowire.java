package org.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_autowire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context=  new ClassPathXmlApplicationContext("org/springcore/autowire/Config_Wire.xml");
		Emp emp1 = context.getBean("emp1",Emp.class);
		System.out.println(emp1);
	}

}

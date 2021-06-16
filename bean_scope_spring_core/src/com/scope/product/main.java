package com.scope.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		test a1=(test) context.getBean("t1");
				
		//we insentiated triangle object using getBean()
	a1.setMessage("I am good");
	a1.getMessage();
	test a2=(test) context.getBean("t1");
	
	//we insentiated triangle object using getBean()
	test a21=(test) context.getBean("t1");
//a2.setMessage("I am not good");
a21.getMessage();
//for singleton produce it produces single bean for any instance ,output for this is i am good&null 
//for prototype multiple beans created for diffferent instance

	}
	
	

}

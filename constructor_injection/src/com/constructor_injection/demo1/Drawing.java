package com.constructor_injection.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Triangle t2=(Triangle)context.getBean("t2");
		t2.draw();
		
		ApplicationContext context1=new ClassPathXmlApplicationContext("spring.xml");
		Triangle t3=(Triangle)context1.getBean("t3");
		t3.draw();
		
		ApplicationContext context2=new ClassPathXmlApplicationContext("spring.xml");
		Triangle t4=(Triangle)context.getBean("t4");
		t4.draw();
		
		

	}

}

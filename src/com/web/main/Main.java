package com.web.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.web.one.Student;



public class Main {

	
	public static void main(String args[]) {
		
		String location= "/com/web/resources/applicationContext.xml";
		ApplicationContext context= new ClassPathXmlApplicationContext(location);
		
		
		Student stu=(Student)context.getBean("div");
		stu.display();
		
	}
}

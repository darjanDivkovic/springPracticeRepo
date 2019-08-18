package com.darjanDivkovic.springTeacherProjectPractice;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MAIN {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Teacher teacher = (Teacher)context.getBean("Teacher");
	
		System.out.println(teacher.toString());

	}

}

package com.darjanDivkovic.springTeacherProjectPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MAIN {
	


	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Teacher teacher = (Teacher)appContext.getBean("Teacher");
		
		System.out.println(teacher.toString());
	}

}

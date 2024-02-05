package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);

		Student s1 = context.getBean("viraj", Student.class);

		s1.study();

		System.out.println(s1);
	}

}

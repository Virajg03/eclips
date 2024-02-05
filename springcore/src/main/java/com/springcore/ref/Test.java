package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collection.Emp;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A aref = (A) context.getBean("aref");
		B bref = (B) context.getBean("bref");

		System.out.println(bref.getY());
		System.out.println(aref.getOb().getY());
		System.out.println(aref.getX());
		
		
	}

}

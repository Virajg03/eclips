package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collection/aloneconfig.xml");

		Person1 p1 = con.getBean("p1", Person1.class);

		System.out.println(p1.getFriends());
		System.out.println(p1.getFriends().getClass().getName());

		System.out.println("___________________________________________________");

		System.out.println(p1.getFeeStruct());
		System.out.println(p1.getFeeStruct().getClass().getName());

		System.out.println("___________________________________________________");

		System.out.println(p1.getProps());
		System.out.println(p1.getProps().getClass().getName());
	}

}

package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		// get or load..

		Configuration c1 = new Configuration();
		c1.configure("hibernate.cfg.xml");
		SessionFactory factory = c1.buildSessionFactory();

		Session session = factory.openSession();

		// get-student : 123
		Student student = session.get(Student.class, 122);
		System.out.println(student);

		Student student1 = session.load(Student.class, 122);
		System.out.println(student1);

		session.close();

		factory.close();
	}

}

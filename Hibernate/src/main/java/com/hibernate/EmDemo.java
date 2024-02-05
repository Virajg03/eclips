package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.EntityTransaction;

public class EmDemo {

	public static void main(String[] args) {
		// create Certificate and student class

		Configuration c1 = new Configuration();
		c1.configure("hibernate.cfg.xml");
		SessionFactory factory = c1.buildSessionFactory();
//
//		Student student = new Student();
//
//		student.setId(12);
//		student.setName("jay");
//		student.setCity("amreli");
//
//		Certificate certificate = new Certificate();
//		certificate.setCourse("Android");
//		certificate.setDuration("2 month");
//		student.setCerti(certificate);

		Student student1 = new Student();

		student1.setId(13);
		student1.setName("kevin");
		student1.setCity("kundala");

		Certificate certificate1 = new Certificate();
		certificate1.setCourse("Java");
		certificate1.setDuration("9 month");
		student1.setCerti(certificate1);

		Session s = factory.openSession();

		EntityTransaction tx1 = s.beginTransaction();

//		s.save(student);
		s.save(student1);

		tx1.commit();

		s.close();

		factory.close();

	}

}

package com.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("project started..");
//
//		Date d1 = new Date();
//		System.out.println(d1);

		Configuration c1 = new Configuration();
		c1.configure("hibernate.cfg.xml");
		SessionFactory factory = c1.buildSessionFactory();

		// creating Student

		Student st = new Student();
		st.setId(124);
		st.setName("viraj");
		st.setCity("ahmedabad");

		System.out.println(st);

//		 creating object of class
		Address ad = new Address();
		ad.setStreet("street4");
		ad.setCity("ahemdabad");

		ad.setAddedDate(new Date());
		ad.setX(12.22);
		System.out.println(ad.getAddedDate());

		// Reading image
		FileInputStream fis = new FileInputStream("src/main/java/ganesh.jpg");
		byte[] b1 = new byte[fis.available()];
		fis.read(b1);
		ad.setImage(b1);

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(st);
		session.save(ad);

		tx.commit();

		session.close();

		System.out.println("Done....");
	}
}

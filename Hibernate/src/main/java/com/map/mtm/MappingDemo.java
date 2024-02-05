package com.map.mtm;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {

		Configuration c1 = new Configuration();
		c1.configure("hibernate.cfg.xml");
		SessionFactory factory = c1.buildSessionFactory();

		// creating employee
		Emp e1 = new Emp();
		Emp e2 = new Emp();

		e1.setEid(123);
		e1.setName("daksheeee");

		System.out.println(e1.getEid() + e1.getName());
		e2.setEid(13);
		e2.setName("kevin");

		// creating projects

		Project p1 = new Project();
		Project p2 = new Project();

		p1.setPid(222);
		p1.setProjectName("Library Management System");

		p2.setPid(223);
		p2.setProjectName("CHATBOT");

		List<Emp> list1 = new ArrayList<Emp>();
		List<Project> list2 = new ArrayList<Project>();

		list1.add(e1);
		list1.add(e2);

		list2.add(p1);
		list2.add(p2);

		e1.setProjects(list2);

		p2.setEmps(list1);

		Session s1 = factory.openSession();

		Transaction tx = s1.beginTransaction();

		s1.save(e1);
		s1.save(e2);
		s1.save(p1);
		s1.save(p2);

		tx.commit();
		s1.close();

		factory.close();

	}

}

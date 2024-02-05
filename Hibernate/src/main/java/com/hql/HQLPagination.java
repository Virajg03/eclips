package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.Student;

public class HQLPagination {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session s1 = factory.openSession();

		Query query = s1.createQuery("from Student");

		query.setFirstResult(0);

		query.setMaxResults(2);

		List<Student> list = query.list();

		for (Student s : list) {
			System.out.println(s);
		}

		s1.close();

		factory.close();
	}
}
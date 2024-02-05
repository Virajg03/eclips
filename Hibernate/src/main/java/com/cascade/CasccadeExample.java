package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.otm.Ans;
import com.map.otm.Que;

public class CasccadeExample {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session s1 = factory.openSession();

		Que q1 = new Que();

		q1.setQuestionId(17);
		q1.setQuestion("what is hibernate?");

		Ans a1 = new Ans(45687, "hibernate is  easy for data management", q1);
		Ans a2 = new Ans(458, "hibernate is a lonnger", q1);
		Ans a3 = new Ans(46655555, "hibernate is  shorter", q1);

		List<Ans> list = new ArrayList<Ans>();

		list.add(a1);
		list.add(a2);
		list.add(a3);

		q1.setAnswer(list);

		Transaction tx = s1.beginTransaction();

		s1.save(q1);

		tx.commit();

		s1.close();

		factory.close();
	}
}
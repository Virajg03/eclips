package com.map.otm;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {

		Configuration c1 = new Configuration();
		c1.configure("hibernate.cfg.xml");
		SessionFactory factory = c1.buildSessionFactory();

		Session s1 = factory.openSession();

		// creating question
		Que q1 = new Que();
		q1.setQuestionId(123);
		q1.setQuestion("what is your porpose you are here");

		// creating answer
		Ans a1 = new Ans();
		a1.setAnswerId(114);
		a1.setAnswer("I am happy to learn...");
		a1.setQue(q1);

		Ans a2 = new Ans();
		a2.setAnswerId(116);
		a2.setAnswer("I am going to  there...");
		a2.setQue(q1);

		List<Ans> list = new ArrayList<Ans>();
		list.add(a1);
		list.add(a2);

		q1.setAnswer(list);

		Transaction tx = s1.beginTransaction();

//		s1.save(q1);
//		s1.save(a1);
//		s1.save(a2);

		Que que = s1.get(Que.class, 123);

		System.out.println(que.getQuestion());

		System.out.println(que.getAnswer().size());

		tx.commit();
		s1.close();

		factory.close();

	}

}

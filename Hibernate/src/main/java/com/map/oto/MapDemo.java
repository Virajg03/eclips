package com.map.oto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {

		Configuration c1 = new Configuration();
		c1.configure("hibernate.cfg.xml");
		SessionFactory factory = c1.buildSessionFactory();

		// creating question
		Question q1 = new Question();
		q1.setQuestionId(123);
		q1.setQuestion("what is java?");

		// creating answer
		Answer a1 = new Answer();
		a1.setAnswerId(321);
		a1.setAnswer("java is programming language..");
		a1.setQue(q1);
		q1.setAnswer(a1);

		// creating question
		Question q2 = new Question();
		q2.setQuestionId(124);
		q2.setQuestion("what is your name?");

		// creating answer
		Answer a2 = new Answer();
		a2.setAnswerId(322);
		a2.setAnswer("my name is ram..");
		a2.setQue(q2);
		q2.setAnswer(a2);

		Session s1 = factory.openSession();

		Transaction tx = s1.beginTransaction();

		s1.save(q1);
		s1.save(a1);
		s1.save(q2);
		s1.save(a2);

		tx.commit();
		s1.close();

		factory.close();

	}

}
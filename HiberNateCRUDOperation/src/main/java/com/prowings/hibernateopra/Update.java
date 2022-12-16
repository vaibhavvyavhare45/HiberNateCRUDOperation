package com.prowings.hibernateopra;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Update implements AutoCloseable {
	public static void main(String[] args) {
		try {
			SessionFactory factory = SessionFactoryProvider.provideSessionFactory();
			Session ses = factory.openSession();
			Transaction tx = ses.beginTransaction();
			Student s = ses.get(Student.class, 101);
			s.setName("marish mokal");
			ses.save(s);
			tx.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void close() throws Exception {
		// TODO Auto-generated method stub

	}

}
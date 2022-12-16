package com.prowings.hibernateopra;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Delete implements AutoCloseable {
	public static void main(String[] args) {
		try {
			SessionFactory factory = SessionFactoryProvider.provideSessionFactory();
			Session ses = factory.openSession();
			Transaction tx = ses.beginTransaction();
			Student s2 = ses.get(Student.class, 103);
			ses.delete(s2);
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

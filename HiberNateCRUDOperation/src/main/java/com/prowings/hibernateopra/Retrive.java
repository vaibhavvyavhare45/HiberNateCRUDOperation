package com.prowings.hibernateopra;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Retrive implements AutoCloseable {
	public static void main(String[] args) {
		try {
			SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
			Session session = sessionFactory.openSession();

			Student s = session.get(Student.class, 101);
			System.out.println("fetching data s:");
			System.out.println("Id : " + s.getId());
			System.out.println("Name : " + s.getName());
			System.out.println("Class : " + s.getStd());
			
			Student s1 = session.get(Student.class, 102);
			System.out.println("fetching data s1:");
			System.out.println("Id : " + s1.getId());
			System.out.println("Name : " + s1.getName());
			System.out.println("Class : " + s1.getStd());
			
			Student s2 = session.get(Student.class, 103);
			System.out.println("fetching data s2:");
			System.out.println("Id : " + s2.getId());
			System.out.println("Name : " + s2.getName());
			System.out.println("Class : " + s2.getStd());
			 

		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void close() throws Exception {
		// TODO Auto-generated method stub

	}
}

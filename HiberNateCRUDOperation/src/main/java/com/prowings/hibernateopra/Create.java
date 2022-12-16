package com.prowings.hibernateopra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Create {
	
	public static void main(String[] args) {
		SessionFactory factory=SessionFactoryProvider.provideSessionFactory();
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		Student st=new Student(101,"vaibhav",10);
		Student st1=new Student(102,"pranav",20);
		Student st2=new Student(103,"marish",30);
	
		s.save(st);
		s.save(st1);
		s.save(st2);
		tx.commit();
		s.close();
		factory.close();
	}
	

}

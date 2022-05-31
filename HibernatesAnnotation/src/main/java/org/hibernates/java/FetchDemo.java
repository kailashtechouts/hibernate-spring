package org.hibernates.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class FetchDemo {

	public static void main(String[] args) {
		
		//get, load
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		//get
		Student student = (Student)session.get(Student.class, 1);
		
		System.out.println(student);
		
		Address ads = (Address)session.load(Address.class, 1);
		
		System.out.println(ads.getStreet()+"  :  "+ads.getCity());
		session.close();
		factory.close();
		
	}

}

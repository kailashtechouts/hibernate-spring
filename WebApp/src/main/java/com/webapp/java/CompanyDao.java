package com.webapp.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CompanyDao {
   
		public static int register(Company c){    
		 int i=0;    
		  
		Configuration cfg = new Configuration();
	    cfg.configure("com/webapp/java/hibernate.cfg.xml");  
		SessionFactory factory = cfg.buildSessionFactory();  
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		  
		i=(Integer)session.save(c);    
		  
		t.commit();    
		session.close();    
		    
		return i;    
		   
		 }    
		}    


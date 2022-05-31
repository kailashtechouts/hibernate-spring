package org.thirdmapA.java;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       
    	Configuration cfg = new Configuration();
    	cfg.configure("org/thirdmapA/java/hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	
    	 Group gAdmin = new Group("Administrator Group");
         Group gGuest = new Group("Guest Group");
          
         User user1 = new User("Chakri", "chakri@gmail.com", "kakazu");
         User user2 = new User("Shyam", "shyam@gmail.com", "sundar");
         
         
         gAdmin.addUser(user1);
         gAdmin.addUser(user2);
         
         gGuest.addUser(user1);
         
         user1.addGroup(gAdmin);
         user2.addGroup(gAdmin);
         user1.addGroup(gGuest);
          
    	Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		
		session.save(gAdmin);
		session.save(gGuest);

		session.getTransaction().commit();
		session.close();       
    } 
}

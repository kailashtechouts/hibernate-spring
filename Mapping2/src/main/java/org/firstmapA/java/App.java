package org.firstmapA.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg = new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory = cfg.buildSessionFactory();
       
       
       Question q = new Question();
       q.setQuestionId(101);
       
       q.setQuestion("What is your city name?");
       
       Answer ans = new Answer();
       ans.setAnswerId(1212);
       ans.setAnswer("My city name is hyderabad");
       ans.setQuestion(q);
       q.setAnswer(ans);
      
      Question q1 = new Question();
       q1.setQuestionId(102);
       q1.setQuestion("What is your state name?");
       
       Answer ans1 = new Answer();
       ans1.setAnswerId(1213);
       ans1.setAnswer("My state name is Telangana");
       ans1.setQuestion(q1);
       q1.setAnswer(ans1);
       
       Session s = factory.openSession();
       Transaction tx = s.beginTransaction();
       
       s.save(q);
       s.save(q1);
       s.save(ans);
       s.save(ans1);
       
       
       tx.commit();
       s.close();

       factory.close();
       
       System.out.println("Finished process..................");
    }
}

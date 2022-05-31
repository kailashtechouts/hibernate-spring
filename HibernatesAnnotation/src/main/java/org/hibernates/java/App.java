package org.hibernates.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException 
    {
        System.out.println( "Project started" );
        
        Configuration cfg = new Configuration();
        cfg.configure();  
        SessionFactory factory = cfg.buildSessionFactory();
        
        //creating student
        Student st = new Student();
        st.setId(101);
        st.setName("rohit");
        st.setCity("Mumbai");
        System.out.println(st);
        
        //creating Address
        Address ad = new Address();
        ad.setStreet("1234 thane");
        ad.setCity("Thane PS");
        ad.setOpen(true);
        ad.setAddDate(new Date());
        ad.setX(1723.635);
        
        //reading image
        FileInputStream fis = new FileInputStream("src/main/java/T-shirt2.jpg");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
         
        Session session =factory.openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(st);
        session.save(ad);
        
        tx.commit(); 
        session.close();
        System.out.println("Done");
    }
}

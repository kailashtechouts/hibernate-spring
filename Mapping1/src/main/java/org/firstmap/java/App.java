package org.firstmap.java;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
    public static void main( String[] args) {
    	
        Configuration cfg = new Configuration();
        cfg.configure("org/firstmap/java/hibernate.cfg.xml");  
        SessionFactory factory = cfg.buildSessionFactory();
         
         Session session =factory.openSession();
         
         Transaction tx = session.beginTransaction();
         
        Product p = new Product();
       
        p.setName("Exide-14AH");
        p.setDescription("Number 1 battery in India");
        p.setPrice(2500);
       
        ProductDetails pd = new ProductDetails();
        pd.setDimension("2,5m x 1,4m x 1,2m");
        pd.setWeight(10);
        pd.setManufacture("ExideLayout");
        pd.setOrigin("India");
       
        
        p.setProductDetails(pd);
        pd.setProduct(p);
        
        session.save(p);
        
        
        List<Product> listProducts = session.createQuery("from Product").list();
        for (Product Prod : listProducts) {
            String str = "Product: " + Prod.getName() + "\n";
            str += "\tDescription: " + Prod.getDescription() + "\n";
            str += "\tPrice: $" + Prod.getPrice() + "\n";
             
            ProductDetails pds = Prod.getProductDetails();
            str += "\tDimension: " + pds.getDimension() + "\n";
            str += "\tWeight: " + pds.getWeight() + "\n";
            str += "\tManufacturer: " + pds.getManufacture() + "\n";
            str += "\tOrigin: " + pds.getOrigin() + "\n";
             
            System.out.println(str);
        }
     
        
        tx.commit(); 
        session.close();
        System.out.println("Done");
        
    }
}

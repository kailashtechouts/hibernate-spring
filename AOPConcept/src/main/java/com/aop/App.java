package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.services.PaymentService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/config.xml");
        
        PaymentService ps = context.getBean("payment",PaymentService.class);
       
       
       //authetication,print:paymentstarted
       ps.makePayment();
    }
}

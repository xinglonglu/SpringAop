package com.lxl.SpringAOP;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
   
    public static void main( String[] args )  
    {  
        System.out.println( "Hello Spring AOP!" );  
        BeanFactory factory=new ClassPathXmlApplicationContext("applicationContext.xml");  
        CustomerManager customerManager=(CustomerManager) factory.getBean("customerManager");  
        customerManager.getCustomerById(2015);  
    }
}

package com.poonam.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {
public static void main(String[] args) {
		
		//Step 1
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		//Step 2
		@SuppressWarnings("deprecation")
		SessionFactory sessionfactory=configuration.buildSessionFactory();
		Session session=sessionfactory.openSession();
		
		//Step 3
		Transaction transaction=session.beginTransaction();
		
		Customer customer = new Customer();
		customer.setName("poonam");
		customer.setEmail("poonam@123gmail.com");

		Transections transection = new Transections();
		transection.setDate("24/4/2023");
		transection.setTotal("5000");

		customer.setTransection(transection);
  
		session.save(customer);
		transaction.commit();
		session.close();
		sessionfactory.close();


}}

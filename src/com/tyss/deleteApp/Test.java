package com.tyss.deleteApp;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateApp.User;

public class Test 
{
  public static void main(String[] args) 
	  {
		User s=new User();
		s.setName("open123");
		//s.setPassword("hello");
		//s.setUsername("welcom");
		
		
		System.out.println("******");
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session sn=factory.openSession();
		Transaction t=sn.beginTransaction();
		sn.delete(s);
		t.commit();
		sn.close();
		
		
	  }
	}




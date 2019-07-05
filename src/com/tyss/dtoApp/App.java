package com.tyss.dtoApp;


import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateApp.User;
public class App 
{
  public static void main(String[] args) 
  {
	User u=new User();
	u.setName("open123");
	u.setPassword("text234");
	u.setUsername("opentext12345");
	
	System.out.println("******");
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	
	
	
	SessionFactory factory=cfg.buildSessionFactory();
	Session s=factory.openSession();
	Transaction t=s.beginTransaction();
	s.save(u);
	t.commit();
	s.close();
	
	
  }
}

package com.hibernate.user_ManagementSystem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.bytebuddy.asm.Advice.ArgumentHandler.Factory;

public class ObjectProvider {
	
	public static EntityManagerFactory factory;
	public static 
	
	
	
	
	public static synchronized EntityManagerFactory getFactory() {
		if(factory==null)
			factory=Persistence.createEntityManagerFactory("abc");
		return factory;
	}

}

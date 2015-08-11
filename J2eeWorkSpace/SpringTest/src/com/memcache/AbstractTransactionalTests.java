package com.memcache;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AbstractTransactionalTests extends TestCase{
	 private ApplicationContext context;  
	 
	 	@Override
	    protected void setUp() throws Exception {  
	        String[] config = { "props/applicationContext.xml", "props/spring-memcached.xml"};  
	        this.context = new ClassPathXmlApplicationContext(config);  
	        super.setUp();  
	    }


		public ApplicationContext getContext() {
			 	String[] config = { "props/applicationContext.xml", "props/spring-memcached.xml"};  
		        this.context = new ClassPathXmlApplicationContext(config);  
			return context;
		}


		public void setContext(ApplicationContext context) {
			this.context = context;
		}
	    
	    
}

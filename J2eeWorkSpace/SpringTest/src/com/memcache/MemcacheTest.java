package com.memcache;

import com.danga.MemCached.MemCachedClient;


public class MemcacheTest{
	private MemCachedClient memcachedClient;  
		public void testAdd(){
			memcachedClient.set("memcached", "memcachedtest");
			System.out.println(memcachedClient.get("memcached"));
		}
		
		 public void testAddUser() {  
		        User user = new User();  
		        user.setUserName("memcached");  
		        memcachedClient.set("user",user);
		        User userG = (User)memcachedClient.get("user");
		        System.out.println(userG.getUserName());  
		    }
		 
		 
		 
		 
		public MemCachedClient getMemcachedClient() {
			return memcachedClient;
		}
		public void setMemcachedClient(MemCachedClient memcachedClient) {
			this.memcachedClient = memcachedClient;
		}
		 
		 
}

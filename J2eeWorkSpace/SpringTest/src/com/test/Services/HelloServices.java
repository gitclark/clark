package com.test.Services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.servlet.ModelAndView;

import com.memcache.MemcacheTest;

public class HelloServices {

	private MemcacheTest memcacheTest;
	
	public ModelAndView vailData(HttpServletRequest request, HttpServletResponse response){
		String name = request.getParameter("name");
		String pwd = request.getParameter("password");
		System.out.println("hello world this is service");
		ModelAndView mv = new ModelAndView();
		if("hello".equals(name) && "world".equals(pwd))
		{
			//MemcacheTest mt = new MemcacheTest();
			memcacheTest.testAdd();
			memcacheTest.testAddUser();
			System.out.println(memcacheTest.getMemcachedClient().get("memcached"));
			mv.addObject("message", "Hello World!");
			
			}else{
				mv.addObject("message", "not users");
			}
			mv.setViewName("hello");
		return mv;
	}

	public MemcacheTest getMemcacheTest() {
		return memcacheTest;
	}

	public void setMemcacheTest(MemcacheTest memcacheTest) {
		this.memcacheTest = memcacheTest;
	}
	
	
}

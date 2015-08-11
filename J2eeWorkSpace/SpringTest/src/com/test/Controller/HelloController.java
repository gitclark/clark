package com.test.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.test.Services.HelloServices;

public class HelloController implements Controller{

	private HelloServices helloservice;
	
	public HelloServices getHelloservice() {
		return helloservice;
	}

	public void setHelloservice(HelloServices helloservice) {
		this.helloservice = helloservice;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//System.out.println("hello world this is controller");
		
		return helloservice.vailData(request, response);
		
		
		/*String name = request.getParameter("name");
		String pwd = request.getParameter("password");
		System.out.println("hello world this is controller");
		ModelAndView mv = new ModelAndView();
		if("hello".equals(name) && "world".equals(pwd))
		{
			
			mv.addObject("message", "Hello World!");
			
			}else{
				mv.addObject("message", "not users");
			}
			mv.setViewName("hello");
		return mv;*/
	}

}

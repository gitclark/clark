<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
 <html>  
 <head>  
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
 <title>Hello World</title>  
 </head>  
 <body>  
 <form id="form1" action="hello" method="post">
 name:<input name="name" type="text" id="name" />
 password:<input name="password" type="text" id="password"/>
 <input type="submit"/>
 </form>
 
 ${message}  
 </body>  
 </html> 

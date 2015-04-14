package com.webservice;
import javax.jws.WebService;

/** 
 * @className:MyServiceImpl.java
 * @Desc:定义：SIB service implemention bean
 * @author:lizhuang
 * @createTime:2012-12-21 上午01:01:22
 */
//endpointInterface指定接入点接口：接口必须存在
@WebService(endpointInterface="com.webservice.IMyservice")
public class MyServiceImpl implements IMyservice {

	public int add(int a, int b) {
		System.out.println("a+b="+(a+b));
		return a+b;
	}

	public int minus(int a, int b) {
		System.out.println("a-b="+(a-b));
		return a-b;
	}

}

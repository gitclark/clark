package com.webservice;
import javax.jws.WebService;

/** 
 * @className:MyServiceImpl.java
 * @Desc:���壺SIB service implemention bean
 * @author:lizhuang
 * @createTime:2012-12-21 ����01:01:22
 */
//endpointInterfaceָ�������ӿڣ��ӿڱ������
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

package com.webservice;
import javax.xml.ws.Endpoint;

/**
 * @className:MyServer.java
 * @Desc:��������
 * @author:lizhuang
 * @createTime:2012-12-21 ����01:02:39
 */
public class MyServer {
	public static void main(String[] args) {
		//���ʷ�ʽ��http://localhost:7777/tudou?wsdl
		String address="http://localhost:7777/tudou";
		Endpoint.publish(address, new MyServiceImpl());
	}
}

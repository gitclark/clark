package com.webservice;

import javax.jws.WebService;

/**
 * @className:IMyservice.java
 * @Desc:���壺SEI service endpoint interface
 * @author:lizhuang
 * @createTime:2012-12-21 ����12:57:18
 */
//JAX-WSע�⣬��ʾjava api xml for webservice��JDK�Դ�API��XML��ʽ��webservice
@WebService
public interface IMyservice {
	
	int add(int a, int b);

	int minus(int a, int b);
}

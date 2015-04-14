package comwebclient;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.webservice.IMyservice;

/**
 * @className:MyClient.java
 * @Desc:访问发布的服务
 * @author:lizhuang
 * @createTime:2012-12-21 上午01:23:57
 */
public class MyClient {
	public static void main(String[] args) {

		try {
			//服务WSDL Document的地址
			URL url = new URL("http://localhost:7777/tudou?wsdl");
			//Qname是qualified name 的简写
			//2.构成：由名字空间(namespace)前缀(prefix)以及冒号(:),还有一个元素名称构成
			//由发布的wsdl可知namespace为http://server.ws.platform.whaty.com/，
			QName qname=new QName("http://webservice.com/","MyServiceImplService"); //这个访问"http://localhost:7777/tudou"里面就有
			Service service=Service.create(url, qname);
			IMyservice ms=service.getPort(IMyservice.class);
			ms.add(1, 4);
			ms.minus(1, 4);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
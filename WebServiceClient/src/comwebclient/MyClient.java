package comwebclient;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.webservice.IMyservice;

/**
 * @className:MyClient.java
 * @Desc:���ʷ����ķ���
 * @author:lizhuang
 * @createTime:2012-12-21 ����01:23:57
 */
public class MyClient {
	public static void main(String[] args) {

		try {
			//����WSDL Document�ĵ�ַ
			URL url = new URL("http://localhost:7777/tudou?wsdl");
			//Qname��qualified name �ļ�д
			//2.���ɣ������ֿռ�(namespace)ǰ׺(prefix)�Լ�ð��(:),����һ��Ԫ�����ƹ���
			//�ɷ�����wsdl��֪namespaceΪhttp://server.ws.platform.whaty.com/��
			QName qname=new QName("http://webservice.com/","MyServiceImplService"); //�������"http://localhost:7777/tudou"�������
			Service service=Service.create(url, qname);
			IMyservice ms=service.getPort(IMyservice.class);
			ms.add(1, 4);
			ms.minus(1, 4);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
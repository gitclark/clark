package comwebclient;

import com.webservice.IMyservice;
import com.webservice.MyServiceImplService;

/**
 * @className:MyClient2.java
 * @Desc:ʹ��JDK wsimport���ɵ�MyServiceImplService���ٷ������ǵķ���
 * @author:lizhuang
 * @createTime:2012-12-22 ����12:24:37
 */
public class MyClient2 {
	public static void main(String[] args) {
		MyServiceImplService myServiceImplService=new MyServiceImplService();
		IMyservice msis= myServiceImplService.getMyServiceImplPort();
		msis.add(1, 4);
		msis.minus(1, 4);
	}
}
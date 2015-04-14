package comwebclient;

import com.webservice.IMyservice;
import com.webservice.MyServiceImplService;

/**
 * @className:MyClient2.java
 * @Desc:使用JDK wsimport生成的MyServiceImplService快速访问我们的服务。
 * @author:lizhuang
 * @createTime:2012-12-22 上午12:24:37
 */
public class MyClient2 {
	public static void main(String[] args) {
		MyServiceImplService myServiceImplService=new MyServiceImplService();
		IMyservice msis= myServiceImplService.getMyServiceImplPort();
		msis.add(1, 4);
		msis.minus(1, 4);
	}
}
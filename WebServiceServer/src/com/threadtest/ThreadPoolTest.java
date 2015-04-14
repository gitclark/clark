package com.threadtest;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>();
		ThreadPoolExecutor executor = new  ThreadPoolExecutor(3, 6, 10, TimeUnit.SECONDS,queue);
		 
		for (int i = 0; i < 20; i++) {
			final int index = i;
			//RunTest x=new RunTest();
	         //   executor.execute(x);
	        executor.shutdown();
	    }

}


class RunTest implements Runnable{
	 public void run() {
         try {
             Thread.sleep(4000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         System.out.println(String.format("thread %d finished", 11));
     }
 }
}

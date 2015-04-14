package com.threadtest;

public class ThreadTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new MyThread(400,"A");
		Thread thread1 = new MyThread(100,"B");
		//while(true){
		thread.start();
		thread1.start();
		
		//thread1.wait(1000);
		//}
		
		
	}

}


class MyThread extends Thread {
	public  static Long x=0l;
	public String str;
	public int num;
	public MyThread(int num,String str){
		this.num=num;
		this.str=str;
	}

	public void run() {
		synchronized (x) {
			for (int i = 0; i < 5; i++) {
				x++;
				try {
					Thread.sleep(num);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(str + ": I'm running!  " + x);
			}
		}
	}
}
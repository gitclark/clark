package com.threadtest;

public class ClientThread2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		r rs = new r();

		Thread t1 = new Thread(new a(rs));
		Thread t2 = new Thread(new b(rs));

		t1.start();
		t2.start();
	}

}

class a implements Runnable {

	r rs;

	a(r rs) {
		this.rs = rs;
	}

	public void run() {

		while (true) {
			synchronized (rs) {

				if (rs.flag) {
					System.out.println(Thread.currentThread() + ":这是A");
					rs.flag = false;
				}
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		}
	}
}

class b implements Runnable {

	r rs;

	b(r rs) {
		this.rs = rs;
	}

	public void run() {

		while (true) {

			synchronized (rs) {
				System.out.println("一直打印着!");
				if (!rs.flag) {
					System.out.println(Thread.currentThread() + ":这是B");
					rs.flag = true;
				}
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				
			}
		}
	}

}

class r {

	boolean flag = false;
}

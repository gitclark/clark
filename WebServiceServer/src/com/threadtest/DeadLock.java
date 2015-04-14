package com.threadtest;

public class DeadLock {
    public static void main(final String[] args) throws Exception {
        final Object obj = new Object();
        new Thread() {
            @Override
            public void run() {
                callWait(obj);
            };
        }.start();
        Thread.sleep(3000L);
        synchronized (obj) {
            try {
            	System.out.println("11111");
                obj.wait();
            }
            catch (final InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static void callWait(final Object obj) {
        synchronized (obj) {
            try {
            	System.out.println("11111");
                obj.wait();
           }
            catch (final InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
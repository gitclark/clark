package com.threadtest;

public class MainTest {

	public static void main(String[] args) {
		baseTest();

	}

	
	public static void baseTest(){
		for(int i=1;i<=10;i++){
			Calculator calculator = new Calculator(i);
			Thread thread = new Thread(calculator);
			thread.start();
			
		}
		
	}
}

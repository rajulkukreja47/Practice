package com.caveofprogramming.threadCreation;

class Runner extends Thread {
	
	public void run() {
		for (int i=0 ; i<100 ;i++) {
			System.out.println("Value is "+i+ " Thread name is "+Thread.currentThread().getName());
			
//			try {
//				Thread.sleep(1);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
}
public class UsingThreadClass {

	public static void main(String[] args) {
		Runner t1 = new Runner();
		t1.setName("1st Thread");
		
		Runner t2 = new Runner();
		t2.setName("2nd Thread");
		
		t1.start();
		t2.start();
	}

}

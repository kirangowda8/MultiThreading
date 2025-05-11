package com.multithreading;

/* 
 * Here the Threads is created in the 2 ways
 * Extending Thread class and implementing the Runnable Interface
 * second approach is preferred because we can achieve the multiple inheritance 
 * 
 */
public class ThreadCreation extends Thread{
	
	@Override
	public void run() {
		System.out.println("Thread started Execution");
	}
	
	public static void main(String[] args) {
		ThreadCreation t1 = new ThreadCreation();
		t1.start();
		
		Thread t2 = new Thread(new MyRunnableThread());
		t2.start();
	}
	

}
 class MyRunnableThread implements Runnable {
	  	
	@Override
	public void run() {
		System.out.println("Runnable Thread is Executed");
		
	}
	
}

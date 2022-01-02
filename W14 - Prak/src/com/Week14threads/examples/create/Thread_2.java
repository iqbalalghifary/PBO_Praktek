package com.Week14threads.examples.create;

/**
 *
 * @author ikbalalghifary
 */

class Thread_2 implements Runnable {
	public void run() {
		System.out.println("In run method; thread name is: "
				+ Thread.currentThread().getName());
	}

	public static void main(String args[]) throws Exception {
		Thread myThread = new Thread(new Thread_2());
		myThread.start();//run(); 
		System.out.println("In main method; thread name is : "
				+ Thread.currentThread().getName());
	}
}
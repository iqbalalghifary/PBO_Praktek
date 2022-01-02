package com.Week14threads.examples.create;

/**
 *
 * @author ikbalalghifary
 */

class Thread_1 extends Thread {
	public void run() {
		System.out.println("In run method; thread name is: "
				+ getName());
	}

	public static void main(String args[]) throws Exception {
		Thread myThread = new Thread_1();
		myThread.start();//run(); 
		System.out.println("In main method; thread name is : "
				+ Thread.currentThread().getName());
	}
}

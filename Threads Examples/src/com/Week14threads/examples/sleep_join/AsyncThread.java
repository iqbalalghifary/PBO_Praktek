package com.Week14threads.examples.sleep_join;
/**
 *
 * @author ikbalalghifary
 */

public class AsyncThread extends Thread {
	public void run() {
		System.out.println("Starting the thread " + getName());
		for (int i = 0; i < 3; i++) {
			System.out.println("In thread " + getName() + "; iteration " + i);
			try {
				//melakukan sleep untuk beberapa waktu sebelum dilakukan iteration
				Thread.sleep(10);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

	public static void main(String args[]) {
		AsyncThread asyncThread1 = new AsyncThread();
		AsyncThread asyncThread2 = new AsyncThread();

		//Memulai 2 threads pada waktu yang bersamaan
		asyncThread1.start();
		asyncThread2.start();
	}
}
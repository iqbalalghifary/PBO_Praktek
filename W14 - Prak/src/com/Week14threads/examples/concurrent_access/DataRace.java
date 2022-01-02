package com.Week14threads.examples.concurrent_access;

/**
 *
 * @author ikbalalghifary
 */

//class ini memperlihatkan penghitung yang dapat diakses publik
//untuk membantu mendemonstrasikan masalah data race
public class DataRace {

	public static void main(String args[]) {
		UseCounter c = new UseCounter();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
	}

	public static class Counter {
		public static long count = 0;
	}

	// class ini mengimplementasikan interface Runnable
	// methods run melakukan increment dan melakukan counter sebanyak 3x
	public static class UseCounter implements Runnable {
		public void increment() {
			// melakukan increment dan mencetak output sesuai value nya dari counter yang dibagikan di antara threads
			Counter.count++;
			System.out.print(Counter.count + " ");
		}

		public void run() {
			increment();
			increment();
			increment();
		}
	}
}

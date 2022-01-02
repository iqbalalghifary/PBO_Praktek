package com.Week14threads.examples.concurrent_access;

/**
 *
 * @author ikbalalghifary
 */

//class ini memperlihatkan counter yang dapat diakses secara public untuk membantu mendemonstrasikan masalah data race
public class DataRaceSync {

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
		public static long count2 = 0;
	}


	// class ini mengimplementasikan interface Runnable
	// methods runnya melakukan increment pada counter dengan melakukan penghitungan sebanyak 3x
	public static class UseCounter implements Runnable {
		public void increment() {
			synchronized (this) {
				Counter.count++;
				System.out.println("In increment: "+ Counter.count + " ");
			}
		}

		public synchronized void incrementSync() {
			// increments pada counter dan mencetak output sesuai value nya dari counter yang dibagikan diantara threads
			Counter.count2++;
			System.out.println("In incrementSync: "+ Counter.count2 + " ");
		}

		public void run() {
			
			increment();
			incrementSync();
			SomeClassWithStatic.incrementSyn();
			SomeClassWithStatic.increment();
			increment();
			incrementSync();
			SomeClassWithStatic.incrementSyn();
			SomeClassWithStatic.increment();
			increment();
			incrementSync();
			SomeClassWithStatic.incrementSyn();
			SomeClassWithStatic.increment();
		}
	}



}

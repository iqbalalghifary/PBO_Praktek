package com.Week14threads.examples.more_thread_states;

/**
 *
 * @author ikbalalghifary
 */

public class WaitingThreadState {

	//Pada class ini, saya menjalankan methods yang menunggu selamanya karena tidak ada yang lain pada proses running
	//Maka dari itu, disini peran threads adalah melakukan pemberitahuan
	static class InfiniteWaitThread extends Thread {
		static boolean okayToRun = false;

		public synchronized void run() {
			while (!okayToRun) {
				try {
					wait();
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String []s) {
		Thread t = new InfiniteWaitThread();
		t.start();
		System.out.println(t.getName() + ": I'm in state " + t.getState());
	}

}

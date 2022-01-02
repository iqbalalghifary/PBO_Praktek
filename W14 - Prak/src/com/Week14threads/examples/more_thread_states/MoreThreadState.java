package com.Week14threads.examples.more_thread_states;

/**
 *
 * @author ikbalalghifary
 */

public class MoreThreadState {

	
	class SleepyThread extends Thread{
		@Override
		public void run() {
			synchronized(SleepyThread.class) {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException ie) {
					ie.printStackTrace();
				}
			}
		}
	}
	
	//Class membuat dua threads untuk menunjukkan bagaimana threads ini akan masuk pada TIMED_WAITING dan status BLOCKED
	public static void main(String[] args) {
		MoreThreadState mt = new MoreThreadState();
		Thread t1 = mt.new SleepyThread();
		Thread t2 = mt.new SleepyThread();
		
		t1.start();
		t2.start();
		System.out.println(t1.getName() + ": I'm in state " + t1.getState());
		System.out.println(t2.getName() + ": I'm in state " + t2.getState());
	}
	
}

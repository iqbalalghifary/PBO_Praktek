package com.Week14threads.examples.illegal_state;

/**
 *
 * @author ikbalalghifary
 */

public class ThreadStateProblem extends Thread {

	public void run() {
		try {
			wait(1000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}

	public static void main(String[] s) {
		new ThreadStateProblem().start();
	}
}

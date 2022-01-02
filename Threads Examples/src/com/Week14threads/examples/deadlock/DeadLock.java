package com.Week14threads.examples.deadlock;

/**
 *
 * @author ikbalalghifary
 */

public class DeadLock {
	
	public static void main(String args[]) throws InterruptedException {
		Counter c = new DeadLock().new Counter();
		// membuat 2 threads dan memulai secara bersamaan pada waktu yang sama
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
		System.out.println("Waiting for threads to complete execution. . .");
		t2.join();
		t2.join();
		System.out.println("Done.");
	}

	// Counter merupakan class thread yang memiliki dua metode – IncrementBallAfterRun dan IncrementRunAfterBall
	// Untuk mendemonstrasikan kebuntuan, kita bisa memanggil dua metode ini dalam methods run,
	// sehingga penguncian dapat dilakukan dalam urutan yang berlawanan dalam dua metode ini

	class Counter implements Runnable {
		// methods ini meningkatkan variabel yang dijalankan terlebih dahulu dan kemudian menambah
		// variabel balls
		// karena variabel ini dapat diakses dari utas lain, kita perlu mendapatkan lock sebelum memprosesnya

		public void IncrementBallAfterRun() {
			// karena dilakukan pengupdate-an variabel run terlebih dahulu, maka lock class Runs
			synchronized (Runs.class) {
				// sekarang kita dapatkan lock pada variabel Balls.class sebelum memperbarui variabel balls
				synchronized (Balls.class) {
					Runs.runs++;
					Balls.balls++;
				}
			}
		}

		public void IncrementRunAfterBall() {
			//dikarenakan kita mengupdate variabel balls terlebih dahulu, maka kita lock terlebih dahulu Balls.class
			synchronized (Balls.class) {
				//sekarang lock pada variabel Runs.class sebelum memperbarui run
				synchronized (Runs.class) {
					Balls.balls++;
					Runs.runs++;
				}
			}
		}

		public void run() {
			//panggil dua methods yang memperoleh kunci dalam urutan yang berbeda
			//namun tergantung pada scheduling threads dan urutan perolehan kunci,
			//deadlock bisa muncul atau tidak
			IncrementBallAfterRun();
			IncrementRunAfterBall();
		}
	}

	//class Balls memiliki anggota data yang dapat diakses secara global untuk menampung jumlah balls dilempar
	static class Balls {
		public static long balls = 0;
	}

	//run class yang memiliki anggota data yang dapat diakses secara global untuk menampung jumlah, sejauh ini run scored
	static class Runs {
		public static long runs = 0;
	}
}

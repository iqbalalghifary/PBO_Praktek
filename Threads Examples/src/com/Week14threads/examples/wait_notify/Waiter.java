package com.Week14threads.examples.wait_notify;

/**
 *
 * @author ikbalalghifary
 */

//pada hal ini melakukan interaksi dengan Mesin Kopi untuk menunggu kopi yang dibuat
//kemudian waiters mengantar kopinya ketika siap dan meminta mesin kopinya untuk membuat kopi berikutnya
//aktivitas ini terus berlanjut secara terus menerus
public class Waiter extends Thread {

	public void getCoffee() {
		synchronized (CoffeeMachine.lock) {
			if (CoffeeMachine.coffeeMade == null) {
				try {

					// tunggu sampai Mesin Kopi memberikan pemberitahuan bahwa kopi sudah siap
					System.out.println("Waiter: Will get orders till coffee machine notifies me ");
					CoffeeMachine.lock.wait();
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}
			System.out.println("Waiter: Delivering " + CoffeeMachine.coffeeMade);
			CoffeeMachine.coffeeMade = null;

			//Disini akan muncul pemberitahuan pada mesin kopi untuk menyiapkan kopi berikutnya
			CoffeeMachine.lock.notifyAll();
			System.out.println("Waiter: Notifying coffee machine to make another one");
		}
	}

	public void run() {
		while (true) {
			getCoffee();
		}
	}
}

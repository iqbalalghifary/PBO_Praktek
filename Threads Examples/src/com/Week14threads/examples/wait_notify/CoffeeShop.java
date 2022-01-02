package com.Week14threads.examples.wait_notify;

/**
 *
 * @author ikbalalghifary
 */

public class CoffeeShop {
	public static void main(String[] s) {
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		Waiter waiter = new Waiter();
		coffeeMachine.start();
		waiter.start();
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_1;

/**
 *
 * @author imdex
 */
public class Main {
    public static void main( String[] args ) {
    try {
        Thread t = new Thread(new AsyncRun());
        t.start();
        System.out.println( "main on thread " + Thread.currentThread().getId());
        throw new NullPointerException();
    }
    catch(Exception ex)
    {
        System.out.println(ex.getClass().getName() + " handled");
    }
  } 
}

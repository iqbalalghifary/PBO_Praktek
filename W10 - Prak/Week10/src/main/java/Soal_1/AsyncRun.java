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
public class AsyncRun implements Runnable {
  @Override
    public void run() {
        try{
            // TODO Auto-generated method stub
            System.out.println("AsyncRun.run on thread "
            + Thread.currentThread().getId());
            throw new ArithmeticException();
        }
        catch(Exception ex){
        System.out.println(ex.getClass().getName() + " handled");
        }
    }
}



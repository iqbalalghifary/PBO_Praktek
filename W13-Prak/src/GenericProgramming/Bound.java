/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericProgramming;

/**
 *
 * @author ikbal alghifary
 */
public class Bound <T extends Manusia> {
    private T objRef;
    
    public Bound(T obj){
        this.objRef = obj;
    }
    
    public void Run(){
        this.objRef.display();
    }
}

class Manusia{
    public void display(){
        System.out.println("Pemanggilan semua Class Generic menggunakan Generic Bound : ");
    }
}
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
public class Generic<T> {
    private T Manusia;
    
    protected void setManusia(T Manusia){
        this.Manusia = Manusia;
    }
    
    protected T getManusia(){
        return Manusia;
    }
}

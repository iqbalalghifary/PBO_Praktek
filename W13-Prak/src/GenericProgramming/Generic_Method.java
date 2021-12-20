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
public class Generic_Method extends Manusia {
    public static <T> void print(T nilai) {
        System.out.println(nilai);
    }
    public void display(){
        System.out.println();
        System.out.println("Nilai-nilai yang dicetak:");

        // Memanggil generic method print
        print("Ellie Baggot"); // String
        print(15); // Integer
        print(false); // Boolean
        print(15.0f); // Float
        print('Z'); // Karakter
    }
}

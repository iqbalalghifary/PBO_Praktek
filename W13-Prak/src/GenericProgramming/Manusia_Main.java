/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericProgramming;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author ikbal alghifary
 */
public class Manusia_Main {
    public static void main(String[] args)
    {
        int pilih;
        for (;;)
        {
            System.out.println("Menu Generic");
            System.out.println("1. Generic Bounded Type Parameters");
            System.out.println("2. Generic Class");
            System.out.println("3. Generic Method");
            System.out.println("4. Generic Interfaces");
            System.out.println("5. Generic WildCard");

            System.out.print("Pilih Menu : ");
            Scanner keyboard = new Scanner(System.in);
            pilih = keyboard.nextInt();

            switch(pilih){
                case 1:
                    // Generic Bounded Type Parameters
                    System.out.println();
                    System.out.println("Generic Bounded Type Parameters");
                    Bound<Manusia> BMan = new Bound<>(new Manusia());
                    BMan.Run();
                    break;
                case 2:
                    // Generic Class
                    System.out.println();
                    System.out.println("Generic Class");
                    Bound<Generic_Class> BGenC = new Bound<>(new Generic_Class());
                    BGenC.Run();
                    break;
                case 3:
                    // Generic Method
                    System.out.println();
                    System.out.println("Generic Method");
                    Bound<Generic_Method> BGenM = new Bound<>(new Generic_Method());
                    BGenM.Run();
                    break;
                case 4:
                    // Generic Interfaces
                    System.out.println();
                    System.out.println("Generic Interfaces");
                    Bound<Generic_Interface> BGenI = new Bound<>(new Generic_Interface());
                    BGenI.Run();
                    break;
                case 5:
                    // Generic WildCard
                    System.out.println();
                    System.out.println("Generic WildCard");
                    Bound<Generic_Wildcard> BGenW = new Bound<>(new Generic_Wildcard());
                    BGenW.Run();
                    break;
                default: System.out.println("Pilihan Tidak ada");
                    break;
            }
            System.out.print("\n\n");
        }
    }
}

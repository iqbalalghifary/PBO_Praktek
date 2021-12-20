/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericProgramming;

/**
 *
 * @author Acer
 */
public class Generic_Interface extends Manusia {

    public void display(){
        Integer inums[] = { 3, 6, 2, 8, 6 };
        Character chs[] = { 'b', 'r', 'p', 'w' };
        Class_Interface<Integer> angka = new Class_Interface<>(inums);
        Class_Interface<Character> character = new Class_Interface<>(chs);
        
        System.out.println("Before Sorting");
        System.out.println("Angka");
        for(Integer i : inums){
            System.out.println(i);
        }
        System.out.println("Huruf");
        for(Character c : chs){
            System.out.println(c);
        }
        
        angka.sort(inums);
        character.sort(chs);
        
        System.out.println("After Sorting Descending");
        System.out.println("Angka");
        for(Integer i : inums){
            System.out.println(i);
        }
        System.out.println("Huruf");
        for(Character c : chs){
            System.out.println(c);
        }
    }
}

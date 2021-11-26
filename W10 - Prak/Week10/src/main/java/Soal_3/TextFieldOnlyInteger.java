/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_3;

import java.util.Scanner;

/**
 *
 * @author imdex
 */
public class TextFieldOnlyInteger {
   public static void main(String[] args) {
        System.out.println("Masukkan input: ");
	Scanner input = new Scanner(System.in);
		try {
			int integer = input.nextInt();
			System.out.println("Nilai input : " + integer);
		}catch(Exception ex) {
			System.out.println("Input harus berupa bilangan bulat!");
		}
            input.close();
	} 
}

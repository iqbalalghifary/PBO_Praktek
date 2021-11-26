/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_3;

/**
 *
 * @author imdex
 */
public class VariableReference {
    String str1;
    String str2 = str1;
    public static void main(String[] args){
	try {
                int angka = str1Class();
                System.out.println("Hasilnya adalah : " + str2);
        }catch(Exception ex) {
                System.out.println("variabel kosong karena belum inisiasi");
        }
    }
}


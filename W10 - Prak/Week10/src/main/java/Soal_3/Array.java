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
public class Array {
    public static void main (String args[])
   {
        String[]mahasiswa = {"Rini","Aldi","Bayu","Juan","Ikbal"};
        try{
                for (int i=0;i<10;i++){
                System.out.println("array "+ i + ":" +  mahasiswa[i]);
            }
        } 
        catch(Exception ex)
        {
		System.out.println("Sudah melebihi isi array Kang!");
		//System.out.println("Panjang array: " + array.length);
	}         
    }
}

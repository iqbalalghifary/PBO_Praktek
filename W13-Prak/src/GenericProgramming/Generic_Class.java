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
public class Generic_Class extends Manusia {
    public void display(){
        //Membuat Instance dan Mendefinisikan Tipe Data String
        Generic<String> nama = new Generic<>();
        nama.setManusia("Ikbal Alghifary");
        System.out.println("Nama Saya: "+nama.getManusia());
        
        //Membuat Instance dan Mendefinisikan Tipe Data Integer
        Generic<Integer> umur = new Generic<>();
        umur.setManusia(19);
        System.out.println("Usia Saya: "+umur.getManusia()+" Tahun");
        
        //Membuat Instance dan Mendefinisikan Tipe Data Boolean
        Generic<Boolean> kondisi = new Generic<>();
        kondisi.setManusia(true);
        System.out.println("Saya Sedang Belajar Java: "+kondisi.getManusia());
        
        //Membuat Instance dan Mendefinisikan Tipe Data Float
        Generic<Float> IPK = new Generic<>();
        IPK.setManusia(4.0f);
        System.out.println("Nilai IPK Saya: "+IPK.getManusia());
        
        //Membuat Instance dan Mendefinisikan Tipe Data Character
        Generic<Character> Karakter = new Generic<>();
        Karakter.setManusia('I');
        System.out.println("Huruf Awalan Nama Saya Adalah: "+Karakter.getManusia());
    }
}

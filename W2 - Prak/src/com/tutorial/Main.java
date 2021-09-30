package com.tutorial;

public class Main {

    public static void main(String[] args) {

        double x = 92.98;
        int nx = (int) Math.round(x);
        System.out.println(nx);
    }
}
/*
Kasus soal diatas termasuk ke dalam
operasi cast, Methods Math.round()
berfungsi untuk membulatkan nilai
ke atas dan mereturn tipe data long
atau int. Seperti pada kasus diatas, x
adalah variabel bertipe double dan
diberi nilai 92.98, kemudian hasil
tersebut akan ditampung ke dalam
variabel nx bertipe integer sehingga
terjadi pembulatan ke atas menjadi
93. Lawan dari Methods
Math.round() adalah Methods
Math.rint() yaitu membulatkan ke
bawah.
Sintaks untuk casting adalah
memberi tipe target dalam tanda
kurung, diikuti dengan nama variabel
*/

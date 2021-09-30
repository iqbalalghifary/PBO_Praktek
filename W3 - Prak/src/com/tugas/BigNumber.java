package com.tugas;

import java.io.*;
import java.util.*;
import java.math.*;

public class BigNumber {
    public static void main(String[] args) {
        //
        Scanner scan = new Scanner(System.in);
        //inputan dari user di masukan ke variabel baru bilangan BigInteger
        BigInteger a = new BigInteger(scan.next());
        BigInteger b = new BigInteger(scan.next());
        //a ditambahkan ke b
        System.out.println(a.add(b));
        //a dikalikan ke b
        System.out.println(a.multiply(b));
    }
}


/*

BigInteger diperlukan dalam operasi matematika ketika nilai integer
yang digunakan sangat besar karena jika  hanya menggunakan tipe
data int bisa menyebabkan integer overflow.
Integer overflow terjadi dalam pemrograman karena suatu operasi
aritmatika yang mencoba untuk memberikan nilai diluar dari range
maksimum dan minimum yang dapat direpresentasikan oleh angka yang
diberikan bit tertentu.
Kondisi tersebut bisa menyebabkan program memberikan hasil yang tidak akurat,
jika tidak diantisipasi dengan baik bisa menyebabkan masalah pada kehandalan
dan keamanan program.

  --- Referensi : Core Java Volume I--Fundamentals, 10th Edition | Hal.135 ---

*/

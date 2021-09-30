package com.tugas;

import java.util.Scanner;
import java.util.*;

public class Berhitung {
    public static void main(String[] args) {

        // a operator b
        Scanner inputUser;
        int a, b, hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.printf("");
        a = inputUser.nextInt();
        System.out.printf("");
        operator = inputUser.next().charAt(0);
        System.out.printf("");
        b = inputUser.nextInt();


        if (operator == '+') {
            // penjumlahan
            hasil = a + b;
            System.out.println(" " + hasil);
        } else if (operator == '-') {
            //pengurangan
            hasil = a - b;
            System.out.println(" " + hasil);
        } else if (operator == '*') {
            //perkalian
            hasil = a * b;
            System.out.println(" " + hasil);
        } else if (operator == '/') {
            //pembagian
            if (b == 0) {
                System.out.println("pembagi nol menghasilkan tak hingga");
            } else {
                hasil = a / b;
                System.out.println(" " + hasil);
            }
        }
        else if (operator == '%'){
          hasil = a % b;
            System.out.println(" " + hasil);
        } else {
            System.out.println("operator tidak ditemukan");
        }
    }
}

/*
    Menggunakan sintax
1. “var1.add(var2)” untuk penjumlahan
2. “var1.substract(var2)” untuk pengurangan
3. “var1.multiply(var2)” untuk perkalian
4. “var1.divide(var2)” untuk pembagian
5. “var1.remainder(var2)” untuk modulo
*/

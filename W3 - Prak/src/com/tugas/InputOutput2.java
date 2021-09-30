package com.tugas;

import java.util.Scanner;

public class InputOutput2 {
        public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
            Scanner sd = new Scanner(System.in);
                Scanner se = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            String s2 = sd.next();
            String s3 = se.next();

            int x = sc.nextInt();
            int y = sd.nextInt();
            int z = se.nextInt();

            System.out.printf("%-15s%03d%n", s1, x);
            System.out.printf("%-15s%03d%n", s2, y);
            System.out.printf("%-15s%03d%n", s3, z);
            System.out.println("================================");
        }
    }
}

/*
"-" digunakan untuk meninggalkan indent
"15" membuat panjang minimum String yang dibutuhkan menjadi 15
"s" (yang merupakan beberapa karakter setelah %) akan diganti dengan String kami
0 mengisi bilangan bulat kita dengan 0 di sebelah kiri
3 membuat bilangan bulat kita menjadi panjang minimum 3
*/



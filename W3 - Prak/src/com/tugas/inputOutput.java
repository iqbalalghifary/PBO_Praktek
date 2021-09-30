package com.tugas;

import java.util.Scanner;

import java.io.*;
import java.util.*;

public class inputOutput {
    public static void main(String[] args) {

        System.out.printf("Input : ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //menambahkan fungsi trim agar jika inputan kosong tidak keluar output 1
        if(s.trim().isEmpty()) {
            System.out.println(0);
        }
        else {
            //untuk menghitung panjang nya inputan
            System.out.println(s.trim().split("[. @_']+").length);

            for(String a : s.trim().split("[. @_']+")){
                System.out.println(a);
            }
        }
        scan.close();
    }
}


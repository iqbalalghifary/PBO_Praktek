package com.tugas;

import java.util.Scanner;

public class BukaTutupJalan {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String numberPolice;
        numberPolice = keyboard.nextLine();
        String [] value = numberPolice.split(" ");
        String number=value[0]+value[1]+value[2]+value[3];
        long num = Long.parseLong(number);
        long sValue=(num-999999) % 5;
        if(sValue == 0) {
            System.out.println("jalan");
        }else {
            System.out.println("berhenti");
        }
    }
}
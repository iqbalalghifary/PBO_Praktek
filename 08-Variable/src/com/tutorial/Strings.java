package com.tutorial;

import java.util.*;

public class Strings {
    public static void main(String[] args) {
        String A, B;
        Scanner sc = new Scanner(System.in);
        System.out.println("First word :");
        A = sc.next();
        System.out.println("Second word :");
        B = sc.next();

        System.out.println(A.length() + B.length());
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.printf(A.substring(0, 1).toUpperCase() + A.substring(1, A.length()));
        System.out.println(" " + B.substring(0, 1).toUpperCase() + B.substring(1, B.length()));
    }
}

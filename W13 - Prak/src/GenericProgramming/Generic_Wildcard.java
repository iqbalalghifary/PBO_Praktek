/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericProgramming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author ikbal alghifary
 */
public class Generic_Wildcard extends Manusia {
    public static void printCollection(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }
    public void display(){
        Collection<String> Group1 = new ArrayList<>();
        Group1.add("Ikbal Alghifary");
        Group1.add("Mario Gomez");
        Group1.add("Shin tae yong");
        System.out.println("Group by Nama : ArrayList Collection");
        printCollection(Group1);
        Collection<Integer> Group2 = new LinkedList<>();
        Group2.add(201511042);
        Group2.add(201511044);
        Group2.add(201511046);
        System.out.println("Group by NIM : LinkedList Collection");
        printCollection(Group2);
        Collection<Character> Group3 = new HashSet<>();
        Group3.add('A');
        Group3.add('B');
        Group3.add('H');
        System.out.println("Group by Character : HashSet Collection");
        printCollection(Group3);
    }
}

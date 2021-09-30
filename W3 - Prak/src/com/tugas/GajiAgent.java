package com.tugas;

import java.util.Scanner;

public class GajiAgent {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int gaji=500000,itemDijual,hargaItem=50000, totalBonus=0,denda=0;
        itemDijual=keyboard.nextInt();
        if(itemDijual>=40 && itemDijual <80) {
            totalBonus=itemDijual*hargaItem *25/100;
            gaji=gaji+totalBonus;
            System.out.println(gaji);
        }else if(itemDijual>=80) {
            totalBonus=itemDijual*hargaItem *35/100;
            gaji=gaji+totalBonus;
            System.out.println(gaji);
        }else if(itemDijual<15) {
            denda=(15-itemDijual)*hargaItem *15/100;
            gaji=gaji-denda;
            System.out.println(gaji);
        }else {
            totalBonus=itemDijual*hargaItem*10/100;
            gaji=gaji+totalBonus;
            System.out.println(gaji);
        }
    }
}

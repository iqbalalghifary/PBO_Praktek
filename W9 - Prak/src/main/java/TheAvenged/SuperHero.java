package TheAvenged;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;

public abstract class SuperHero implements Comparable<SuperHero> {
    private int powerLevel;
    private String name;
    private ArrayList<Power> powerList = new ArrayList();

    public SuperHero(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }
    //getter
    public int getPowerLevel() {
        return this.powerLevel;
    }
    //getter
    public String getName() {
        return this.name;
    }

    public void addPower(Power power) {
        this.powerList.add(power);
    }

    public void identity() {
    }

    public void showPowers() {
        System.out.println(".....HEED ME.....");
        System.out.println("FOR MY NAAAAAAAME IS " + this.getName().toUpperCase());
        System.out.println("TIME TO SHOW YOU MY POWERS");
        Iterator var1 = this.powerList.iterator();

        while(var1.hasNext()) {
            Power i = (Power)var1.next();
            i.doPower();
        }

    }

    public int compareTo(SuperHero o) {
        if (this.powerLevel < o.getPowerLevel()) {
            return -1;
        } else {
            return this.powerLevel > this.getPowerLevel() ? 1 : 0;
        }
    }
}

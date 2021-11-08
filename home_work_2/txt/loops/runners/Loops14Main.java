package home_work_2.txt.loops.runners;

import home_work_2.txt.loops.Loops14;

public class Loops14Main {
    public static void main(String[] args) {
        Loops14 loops14 = new Loops14();
        System.out.println("5: "+ loops14.overflow(5));
        System.out.println("188: " + loops14.overflow(188));
        System.out.println("-19: " + loops14.overflow(-19));
        System.out.println("111: " + loops14.overflow(111));
    }
}

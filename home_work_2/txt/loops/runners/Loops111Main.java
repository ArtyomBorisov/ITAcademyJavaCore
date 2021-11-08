package home_work_2.txt.loops.runners;

import home_work_2.txt.loops.Loops111;

public class Loops111Main {
    public static void main(String[] args) {
        Loops111 loops111 = new Loops111();
        long tmp = loops111.validationAndParseNumber(args[0]);
        System.out.println(loops111.factorial(tmp));
    }
}

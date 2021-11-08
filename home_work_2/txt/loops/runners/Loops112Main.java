package home_work_2.txt.loops.runners;

import home_work_2.txt.loops.Loops112;

public class Loops112Main {
    public static void main(String[] args) {
        Loops112 loops112 = new Loops112();
        long tmp = loops112.validationAndParseNumber(args[0]);
        System.out.println(loops112.factorial(tmp));
    }
}

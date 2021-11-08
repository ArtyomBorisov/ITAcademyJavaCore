package home_work_2.txt.loops.runners;

import home_work_2.txt.loops.Loops13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Loops13Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Loops13 loops13 = new Loops13();
        double a;
        int b;

        while (true) {
            try {
                System.out.println("Введите число, которое будем возводить в степень:");
                a = scan.nextDouble();
                break;
            } catch (InputMismatchException e) {
                scan.next();
            }
        }

        while (true) {
            try {
                System.out.println("Введите целую положительную степень:");
                b = scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                scan.next();
            }
        }

        System.out.println(loops13.pow(a, b));
    }
}

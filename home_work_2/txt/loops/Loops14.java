package home_work_2.txt.loops;

import java.util.Scanner;

public class Loops14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = 1;
        System.out.print("На какое число умножаем единицу до переполнения? ");
        long b = scan.nextInt();
        while(true) {
            try {
                a = Math.multiplyExact(a , b);
            } catch (ArithmeticException e) {
                System.out.println("Произошло переполнение. Значение до переполнения: " + a + ". Значение после переполнения: " + a * b);
                return;
            }
        }
    }
}

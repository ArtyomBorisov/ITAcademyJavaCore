package home_work_2.presentation.loops;

import java.util.Scanner;

public class PresentationLoops1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scan.nextInt();
        int m = a % 10;
        a /= 10;

        while(a != 0) {
            if (a % 10 > m) {
                m = a % 10;
            }
            a /= 10;
        }

        System.out.println("Наибольшая цифра натурального числа = " + m);
    }
}

package home_work_2.txt.loops;

import java.util.Scanner;

public class Loops13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Какое число возводим? ");
        double a = scan.nextDouble();
        System.out.print("В какую степень возводим? ");
        int b = scan.nextInt();

        while (true) {
            if (b > 0) {
                break;
            } else {
                System.out.println("Степень только положительная. Введите ещё раз:");
                b = scan.nextInt();
            }
        }

        double result = a;
        for (int i = 1; i < b; i++) {
            result *= a;
        }
        System.out.printf("Число %.2f в степени %d равно %.2f" , a, b, result);
    }
}

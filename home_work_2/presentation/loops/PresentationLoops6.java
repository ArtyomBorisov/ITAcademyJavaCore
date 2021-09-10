package home_work_2.presentation.loops;

import java.util.Scanner;

public class PresentationLoops6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number1 = scan.nextInt();
        int number2 = 0;

        while (number1 != 0) {
            number2 = number2 * 10 + number1 % 10;
            number1 /= 10;
        }

        System.out.println("Перернутое число: " + number2);
    }
}

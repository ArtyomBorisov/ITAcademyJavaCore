package home_work_2.presentation.loops;

import java.util.Scanner;

public class PresentationLoops5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите минимум диапазона: ");
        int min = scan.nextInt();
        System.out.print("Введите максимум диапазона: ");
        int max = scan.nextInt();
        System.out.print("Введите шаг: ");
        int step = scan.nextInt();

        for (int i = min; i <= max; i = i + step) {
            System.out.print(i + " ");
        }
    }
}

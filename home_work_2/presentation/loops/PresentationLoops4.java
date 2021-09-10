package home_work_2.presentation.loops;

import java.util.Scanner;

public class PresentationLoops4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Сколько элементов ряда Фибоначчи вывести? ");
        int numbers = scan.nextInt();
        int a = 1;
        int b = 2;
        int count = 2;
        System.out.print(a + " " + b);

        while (count != numbers) {
            int sum = a + b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
            count++;
        }

    }
}

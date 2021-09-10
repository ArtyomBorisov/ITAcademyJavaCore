package home_work_2.presentation.loops;

import java.util.Scanner;

public class PresentationLoops3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scan.nextInt();
        int even = 0; // четные
        int odd = 0; // нечетные

        while (num != 0) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num /= 10;
        }

        System.out.println("Чётных цифр - " + even + ", а нечётных - " + odd);
    }
}

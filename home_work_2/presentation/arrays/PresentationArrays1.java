package home_work_2.presentation.arrays;

import java.util.Random;
import java.util.Scanner;

public class PresentationArrays1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько чисел будет содержать массив?");
        int length = scan.nextInt();
        int[] numbers = new int[length];
        Random rand = new Random();
        System.out.print("Массив случайных чисел: ");
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
            System.out.print(numbers[i] + "  ");
            if (numbers[i] > 0 && numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        System.out.println();
        System.out.println("Сумма четных положительных элементов массива = " + sum);
    }
}

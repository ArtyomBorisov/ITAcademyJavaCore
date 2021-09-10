package home_work_2.presentation.arrays;

import java.util.Random;
import java.util.Scanner;

public class PresentationArrays5 {
    public static void main(String[] args) {
        int length = 10; // длина массивов
        int j = 0; // индекс нового массива
        int[] numbers = new int[length];
        int[] newNumbers = new int[length];
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print("Массив случайных чисел: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nЗадайте интервал [a,b]:");
        System.out.print("a = ");
        int a = scan.nextInt();
        System.out.print("b = ");
        int b = scan.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= a && numbers[i] <= b) {
                numbers[i] = 0;
            } else {
                newNumbers[j] = numbers[i];
                j++;
            }
        }

        System.out.print("Новый массив без элементов, принадлежащих интервалу [" + a + "," + b + "]:");
        for (int element: newNumbers) {
            System.out.print(" " + element);
        }
    }
}

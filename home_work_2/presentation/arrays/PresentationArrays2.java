package home_work_2.presentation.arrays;

import java.util.Random;

public class PresentationArrays2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();
        System.out.print("Массив случайных чисел: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
            System.out.print(numbers[i] + " ");
        }

        int max = 0;

        for (int i = max + 2; i < numbers.length; i += 2) {
            if (numbers[i] > numbers[max]) {
                max = i;
            }
        }
        System.out.print("\nМаксимальный элемент с чётным индексом = " + numbers[max]);
        System.out.print(" под индексом " + max);
    }
}

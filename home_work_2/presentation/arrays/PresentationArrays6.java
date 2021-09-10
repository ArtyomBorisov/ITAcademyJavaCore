package home_work_2.presentation.arrays;

import java.util.Random;

public class PresentationArrays6 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random rand = new Random();
        int sum = 0;
        System.out.print("Массив случайных чисел: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
            System.out.print(numbers[i] + " ");
        }

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            while (numbers[i] != 0) {
                int ostatok = numbers[i] % 10;
                sum += ostatok;
                numbers[i] /= 10;
            }
            numbers[i] = num;
        }

        System.out.println("\nСумма чисел = " + sum);
    }
}

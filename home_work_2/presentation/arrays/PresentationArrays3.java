package home_work_2.presentation.arrays;

import java.util.Random;

public class PresentationArrays3 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();
        int sum = 0;
        System.out.print("Массив случайных чисел: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
            sum += numbers[i];
            System.out.print(numbers[i] + "  ");
        }

        double average = 1.0 * sum / numbers.length;
        System.out.println("\nСреднее арифметическое = " + average);
        System.out.print("Элементы массива, которые меньше среднего арифметического: ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < average) {
                System.out.print(numbers[i] + "  ");
            }
        }
    }
}

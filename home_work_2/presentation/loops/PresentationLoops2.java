package home_work_2.presentation.loops;

import java.util.Random;

public class PresentationLoops2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 0; // счётчик
        int numbers = 10000; // количество чисел в выборке

        for (int i = 0; i < numbers; i++) {
            int number = rand.nextInt(100);
            if (number % 2 == 0) {
                count++;
            }
        }

        System.out.println("Процент чётных чисел при выборке из " + numbers + " случайных чисел равен " + 100.0 * count / numbers + " %");
    }
}

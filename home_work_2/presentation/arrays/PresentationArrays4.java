package home_work_2.presentation.arrays;

import java.util.Random;

public class PresentationArrays4 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();
        int sum = 0;
        System.out.print("Массив случайных чисел: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
            System.out.print(numbers[i] + " ");
        }

        int min1 = 0;
        int min2 = 1;

        for (int i = 2; i < numbers.length; i++){
            if (numbers[i] < numbers[min1]) {
                if (numbers[min1] < numbers[min2]){
                    min2 = min1;
                }
                min1 = i;
            } else if (numbers[i] < numbers[min2]) {
                min2 = i;
            }
        }

        System.out.println("\nДва наименьших (минимальных) элемента массива: " + numbers[min1] + " " + numbers[min2]);
    }
}

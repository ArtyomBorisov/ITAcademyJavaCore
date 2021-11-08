package home_work_2.presentation.arrays.runners;

import home_work_2.presentation.arrays.PresentationArrays1;
import home_work_2.txt.arrays.ArraysUtils;

import java.util.Arrays;
import java.util.Scanner;

public class PresentationArrays1Main {
    public static void main(String[] args) {
        PresentationArrays1 util = new PresentationArrays1();
        Scanner scan = new Scanner(System.in);

        System.out.println("Сколько чисел будет содержать массив?");
        int length = scan.nextInt();
        System.out.println("Максимальное значение числа в массиве?");
        int maxValue = scan.nextInt();

        int[] array = ArraysUtils.arrayRandom(length, maxValue);
        System.out.println("Массив случайных чисел: " + Arrays.toString(array));

        System.out.println("Сумма четных положительных элементов массива = " + util.sumEvenPlusNumbersOfArray(array));
    }
}

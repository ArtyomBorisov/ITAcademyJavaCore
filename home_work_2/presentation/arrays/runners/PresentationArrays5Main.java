package home_work_2.presentation.arrays.runners;

import home_work_2.presentation.arrays.PresentationArrays5;
import home_work_2.txt.arrays.ArraysUtils;

import java.util.Arrays;
import java.util.Scanner;

public class PresentationArrays5Main {
    public static void main(String[] args) {
        PresentationArrays5 util = new PresentationArrays5();
        Scanner scan = new Scanner(System.in);

        System.out.println("Сколько чисел будет содержать массив?");
        int length = scan.nextInt();
        System.out.println("Максимальное значение числа в массиве?");
        int maxValue = scan.nextInt();

        int[] arr = ArraysUtils.arrayRandom(length, maxValue);
        System.out.println("Массив случайных чисел: " + Arrays.toString(arr));

        System.out.println("Задайте интервал [a,b]:");
        System.out.print("a = ");
        int a = scan.nextInt();
        System.out.print("b = ");
        int b = scan.nextInt();

        int[] resultArr = util.deleteIntervalFromArray(arr, a, b);

        System.out.println("Новый массив без элементов, принадлежащих интервалу [" + a + "," + b + "]: " + Arrays.toString(resultArr));
        System.out.println(Arrays.toString(arr));
    }
}

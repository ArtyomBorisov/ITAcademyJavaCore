package home_work_2.presentation.arrays.runners;

import home_work_2.presentation.arrays.PresentationArrays3;
import home_work_2.txt.arrays.ArraysUtils;

import java.util.Arrays;
import java.util.Scanner;

public class PresentationArrays3Main {
    public static void main(String[] args) {
        PresentationArrays3 util = new PresentationArrays3();
        Scanner scan = new Scanner(System.in);

        System.out.println("Сколько чисел будет содержать массив?");
        int length = scan.nextInt();
        System.out.println("Максимальное значение числа в массиве?");
        int maxValue = scan.nextInt();

        int[] arr = ArraysUtils.arrayRandom(length, maxValue);
        System.out.println("Массив случайных чисел: " + Arrays.toString(arr));

        System.out.println("Элементы массива, которые меньше среднего арифметического: "
                + util.findElementsLessAverage(arr));
    }
}

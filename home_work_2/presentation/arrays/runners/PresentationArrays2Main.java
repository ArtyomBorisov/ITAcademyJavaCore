package home_work_2.presentation.arrays.runners;

import home_work_2.presentation.arrays.PresentationArrays2;
import home_work_2.txt.arrays.ArraysUtils;

import java.util.Arrays;
import java.util.Scanner;

public class PresentationArrays2Main {
    public static void main(String[] args) {
        PresentationArrays2 util = new PresentationArrays2();
        Scanner scan = new Scanner(System.in);

        System.out.println("Сколько чисел будет содержать массив?");
        int length = scan.nextInt();
        System.out.println("Максимальное значение числа в массиве?");
        int maxValue = scan.nextInt();

        int[] arr = ArraysUtils.arrayRandom(length, maxValue);
        System.out.println("Массив случайных чисел: " + Arrays.toString(arr));

        System.out.println("Максимальный элемент с чётным индексом = " + util.findMaxNumberOfElementWithEvenIndex(arr));
    }
}

package home_work_2.txt.sorts.runners;

import home_work_2.txt.sorts.SortsUtils;

import java.util.Arrays;

import static home_work_2.txt.arrays.ArraysUtils.arrayFromConsole;
import static home_work_2.txt.arrays.ArraysUtils.arrayRandom;

public class SortsUtilsMain {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {1,1,1,1};
        int[] array3 = {9,1,5,99,9,9};
        int[] array4 = {};
        int[] array5 = arrayRandom(10, 100);
        int[] array6 = arrayFromConsole();

        System.out.println("Пузырьковая сортировка:");
        System.out.println(bubbleSortAndPrintArray(array1));
        System.out.println(bubbleSortAndPrintArray(array2));
        System.out.println(bubbleSortAndPrintArray(array3));
        System.out.println(bubbleSortAndPrintArray(array4));
        System.out.println(bubbleSortAndPrintArray(array5));
        System.out.println(bubbleSortAndPrintArray(array6));

//        System.out.println("Шейкерная сортировка:");
//        System.out.println(shakerSortAndPrintArray(array1));
//        System.out.println(shakerSortAndPrintArray(array2));
//        System.out.println(shakerSortAndPrintArray(array3));
//        System.out.println(shakerSortAndPrintArray(array4));
//        System.out.println(shakerSortAndPrintArray(array5));
//        System.out.println(shakerSortAndPrintArray(array6));
    }

    public static String bubbleSortAndPrintArray(int[] array) {
        return "Массив до сортировки " + Arrays.toString(array) + "\nМассив после сортировки: "
                + Arrays.toString(SortsUtils.bubbleSort(array));
    }

    public static String shakerSortAndPrintArray(int[] array) {
        return "Массив до сортировки " + Arrays.toString(array) + "\nМассив после сортировки: "
                + Arrays.toString(SortsUtils.shakerSort(array));
    }
}

package home_work_2.txt.sorts;

import java.util.Arrays;

import static home_work_2.txt.arrays.ArraysUtils.arrayFromConsole;
import static home_work_2.txt.arrays.ArraysUtils.arrayRandom;

public class SortsUtils {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {1,1,1,1};
        int[] array3 = {9,1,5,99,9,9};
        int[] array4 = {};
        int[] array5 = arrayRandom(10, 100);
        int[] array6 = arrayFromConsole();


        System.out.println("Пузырьковая сортировка:");
        bubbleSort(array1);
        bubbleSort(array2);
        bubbleSort(array3);
        bubbleSort(array4);
        bubbleSort(array5);
        bubbleSort(array6);

        /*System.out.println("Шейкерная сортировка:");
        shakerSort(array1);
        shakerSort(array2);
        shakerSort(array3);
        shakerSort(array4);
        shakerSort(array5);
        shakerSort(array6);*/

    }

    public static void bubbleSort (int[] array) {
        boolean isSorted = false;
        int element;
        System.out.println("Массив до сортировки: " + Arrays.toString(array));

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    element = array[i+1];
                    array[i+1] = array[i];
                    array[i] = element;
                    isSorted = false;
                }
            }
        }

        System.out.println("Массив после сортировки: " + Arrays.toString(array) + "\n");
    }

    public static void shakerSort (int[] array) {
        boolean isSorted = false;
        int element;
        System.out.println("Массив до сортировки: " + Arrays.toString(array));
        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    element = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = element;
                    isSorted = false;
                }
            }

            for (int i = array.length - 1; i > 0 ; i--) {
                if (array[i] < array[i - 1]) {
                    element = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = element;
                    isSorted = false;
                }
            }
        }

        System.out.println("Массив после сортировки: " + Arrays.toString(array) + "\n");
    }
}

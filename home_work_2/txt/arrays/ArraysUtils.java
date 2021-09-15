package home_work_2.txt.arrays;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] container = arrayFromConsole();
        System.out.println("Выберите: 1. Вывести все элементы в консоль.");
        System.out.println("2. Вывести каждый второй элемент массива в консоль.");
        System.out.println("3. Вывести все элементы массива в консоль в обратном порядке.");
        while (true) {
            int num = scan.nextInt();
            if (num == 1) {
                System.out.println(showElements(container));
                break;
            } else if (num == 2) {
                System.out.println(showEverySecondElement(container));
                break;
            } else if (num == 3) {
                System.out.println(inverseArray(container));
                break;
            } else {
                System.out.println("Нужно выбрать 1, 2 или 3! Выберите ещё раз:");
            }
        }
    }

    public static int[] arrayFromConsole() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Длина массива = ");
        int length = scan.nextInt();
        int[] container = new int[length];
        for (int i = 0; i < container.length; i++) {
            System.out.print("Введите значение в ячейку №" + (i+1) + ": ");
            container[i] = scan.nextInt();
        }
        return(container);
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        Random rand = new Random();
        int[] container = new int[size];
        for (int i = 0; i < container.length; i++) {
            container[i] = rand.nextInt(maxValueExclusion);
        }
        return(container);
    }

    static String showElements(int[] container) {
        String allArray = "Массив: ";
        for (int element: container) {
            allArray = allArray + element + " ";
        }
        return allArray;
    }

    static String showEverySecondElement(int[] container) {
        String secondElements = "Каждый второй элемент массива: ";
        for (int i = 1; i < container.length; i += 2) {
            secondElements = secondElements + container[i] + " ";
        }
        return secondElements;
    }

    static String inverseArray(int[] container) {
        String inverse = "Массив в обратном порядке: ";
        for (int i = container.length - 1; i >= 0; i--) {
            inverse = inverse + container[i] + " ";
        }
        return inverse;
    }
}

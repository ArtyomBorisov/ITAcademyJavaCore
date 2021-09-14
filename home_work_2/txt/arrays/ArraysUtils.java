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
                showElements(container);
                break;
            } else if (num == 2) {
                showEverySecondElement(container);
                break;
            } else if (num == 3) {
                inverseArray(container);
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

    public static void showElements(int[] container) {
        System.out.print("Массив: ");
        for (int element: container) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void showEverySecondElement(int[] container) {
        System.out.print("Каждый второй элемент массива: ");
        for (int i = 1; i < container.length; i += 2) {
            System.out.print(container[i] + " ");
        }
        System.out.println();
    }

    public static void inverseArray(int[] container) {
        System.out.print("Массив в обратном порядке: ");
        for (int i = container.length - 1; i >= 0; i--) {
            System.out.print(container[i] + " ");
        }
        System.out.println();
    }
}

package home_work_2.txt.arrays.task2_3;

import static home_work_2.txt.arrays.ArraysUtils.arrayFromConsole;

public class ForOperation implements IArraysOperation {

    public void showElements() {
        int[] container = arrayFromConsole();
        System.out.print("Массив: ");
        for (int element: container) {
            System.out.print(element + " ");
        }
    }

    public void showEverySecondElement() {
        int[] container = arrayFromConsole();
        System.out.print("Каждый второй элемент массива: ");
        for (int i = 1; i < container.length; i += 2) {
            System.out.print(container[i] + " ");
        }
    }

    public void inverseArray() {
        int[] container = arrayFromConsole();
        System.out.print("Массив в обратном порядке: ");
        for (int i = container.length - 1; i >= 0; i--) {
            System.out.print(container[i] + " ");
        }
    }
}

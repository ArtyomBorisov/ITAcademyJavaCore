package home_work_2.txt.arrays.task2_3;

import static home_work_2.txt.arrays.ArraysUtils.arrayFromConsole;

public class WhileOperation implements IArraysOperation {

    public void showElements() {
        int[] container = arrayFromConsole();
        int i = 0;
        System.out.print("Массив: ");
        while (i < container.length) {
            System.out.print(container[i] + " ");
            i++;
        }
    }

    public void showEverySecondElement() {
        int[] container = arrayFromConsole();
        int i = 1;
        System.out.print("Каждый второй элемент массива: ");
        while (i < container.length) {
            System.out.print(container[i] + " ");
            i += 2;
        }
    }

    public void inverseArray() {
        int[] container = arrayFromConsole();
        int i = container.length - 1;
        System.out.print("Массив в обратном порядке: ");
        while (i >= 0) {
            System.out.print(container[i] + " ");
            i--;
        }
    }
}

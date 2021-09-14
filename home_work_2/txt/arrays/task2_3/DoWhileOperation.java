package home_work_2.txt.arrays.task2_3;

import static home_work_2.txt.arrays.ArraysUtils.arrayFromConsole;

public class DoWhileOperation implements IArraysOperation {

    public void showElements() {
        int[] container = arrayFromConsole();
        int i = 0;
        System.out.print("Массив: ");
        do {
            System.out.print(container[i] + " ");
            i++;
        } while (i < container.length);
    }

    public void showEverySecondElement() {
        int[] container = arrayFromConsole();
        int i = 1;
        System.out.print("Каждый второй элемент массива: ");
        do {
            System.out.print(container[i] + " ");
            i += 2;
        } while (i < container.length);
    }

    public void inverseArray() {
        int[] container = arrayFromConsole();
        int i = container.length - 1;
        System.out.print("Массив в обратном порядке: ");
        do {
            System.out.print(container[i] + " ");
        } while (i >= 0);
    }
}

package home_work_2.txt.arrays.task2_3;

import static home_work_2.txt.arrays.ArraysUtils.arrayFromConsole;

public class DoWhileOperation implements IArraysOperation {

    public String showElements() {
        int[] container = arrayFromConsole();
        int i = 0;
        String allArray = "Массив: ";
        do {
            allArray = allArray + container[i] + " ";
            i++;
        } while (i < container.length);
        return allArray;
    }

    public String showEverySecondElement() {
        int[] container = arrayFromConsole();
        int i = 1;
        String secondElements = "Каждый второй элемент массива: ";
        do {
            secondElements = secondElements + container[i] + " ";
            i += 2;
        } while (i < container.length);
        return secondElements;
    }

    public String inverseArray() {
        int[] container = arrayFromConsole();
        int i = container.length - 1;
        String inverse = "Массив в обратном порядке: ";
        do {
            inverse = inverse + container[i] + " ";
        } while (i >= 0);
        return inverse;
    }
}

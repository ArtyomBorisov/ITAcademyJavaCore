package home_work_2.txt.arrays.task2_3;

import static home_work_2.txt.arrays.ArraysUtils.arrayFromConsole;

public class ForOperation implements IArraysOperation {

    public String showElements() {
        int[] container = arrayFromConsole();
        String allArray = "Массив: ";
        for (int i = 0; i < container.length; i++) {
            allArray = allArray + container[i] + " ";
        }
        return allArray;
    }

    public String showEverySecondElement() {
        int[] container = arrayFromConsole();
        String secondElements = "Каждый второй элемент массива: ";
        for (int i = 1; i < container.length; i += 2) {
            secondElements = secondElements + container[i] + " ";
        }
        return secondElements;
    }

    public String inverseArray() {
        int[] container = arrayFromConsole();
        String inverse = "Массив в обратном порядке: ";
        for (int i = container.length - 1; i >= 0; i--) {
            inverse = inverse + container[i] + " ";
        }
        return inverse;
    }
}

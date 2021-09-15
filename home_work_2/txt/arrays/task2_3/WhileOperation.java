package home_work_2.txt.arrays.task2_3;

import static home_work_2.txt.arrays.ArraysUtils.arrayFromConsole;

public class WhileOperation implements IArraysOperation {

    public String showElements() {
        int[] container = arrayFromConsole();
        int i = 0;
        String allArray = "Массив: ";
        while (i < container.length) {
            allArray = allArray + container[i] + " ";
            i++;
        }
        return allArray;
    }

    public String  showEverySecondElement() {
        int[] container = arrayFromConsole();
        int i = 1;
        String secondElements = "Каждый второй элемент массива: ";
        while (i < container.length) {
            secondElements = secondElements + container[i] + " ";
            i += 2;
        }
        return secondElements;
    }

    public String inverseArray() {
        int[] container = arrayFromConsole();
        int i = container.length - 1;
        String inverse = "Массив в обратном порядке: ";
        while (i >= 0) {
            inverse = inverse + container[i] + " ";
            i--;
        }
        return inverse;
    }
}

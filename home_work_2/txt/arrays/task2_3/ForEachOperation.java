package home_work_2.txt.arrays.task2_3;

import static home_work_2.txt.arrays.ArraysUtils.arrayFromConsole;

public class ForEachOperation implements IArraysOperation {

    public String showElements() {
        int[] container = arrayFromConsole();
        String allArray = "Массив: ";
        for (int element : container) {
            allArray = allArray + element + " ";
        }
        return allArray;
    }

    public String showEverySecondElement() {
        int[] container = arrayFromConsole();
        int i = 0;
        String secondElements = "Каждый второй элемент массива: ";
        for (int element: container) {
            if (i % 2 == 1) {
                secondElements = secondElements + element + " ";
            }
            i++;
        }
        return secondElements;
    }

    public String inverseArray() {
        int[] container = arrayFromConsole();
        String inverse = "";
        for (int element: container) {
            inverse = element + " " + inverse;
        }
        return "Массив в обратном порядке: " + inverse;
    }
}

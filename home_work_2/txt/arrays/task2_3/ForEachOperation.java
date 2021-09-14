package home_work_2.txt.arrays.task2_3;

import static home_work_2.txt.arrays.ArraysUtils.arrayFromConsole;

public class ForEachOperation implements IArraysOperation {

    public void showElements() {
        int[] container = arrayFromConsole();
        System.out.print("Массив: ");
        for (int element : container) {
            System.out.print(element + " ");
        }
    }

    public void showEverySecondElement() {
        int[] container = arrayFromConsole();
        int i = 0;
        System.out.print("Каждый второй элемент массива: ");
        for (int element: container) {
            if (i % 2 == 1) {
                System.out.print(element + " ");
            }
            i++;
        }
    }

    public void inverseArray() {
        int[] container = arrayFromConsole();
        String text = "";
        System.out.print("Массив в обратном порядке: ");
        for (int element: container) {
            text = element + " " + text;
        }
        System.out.println(text);
    }
}

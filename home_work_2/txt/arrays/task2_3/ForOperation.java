package home_work_2.txt.arrays.task2_3;

import home_work_2.txt.arrays.task2_3.api.IArraysOperation;

public class ForOperation implements IArraysOperation {

    public String showElements(int[] container) {
        StringBuilder sb = new StringBuilder();
        sb.append("Массив: ");

        for (int i = 0; i < container.length; i++) {
            sb.append(container[i]).append(" ");
        }

        return sb.toString();
    }

    public String showEverySecondElement(int[] container) {
        StringBuilder sb = new StringBuilder();
        sb.append("Каждый второй элемент массива: ");

        for (int i = 1; i < container.length; i += 2) {
            sb.append(container[i]).append(" ");
        }

        return sb.toString();
    }

    public String inverseArray(int[] container) {
        StringBuilder sb = new StringBuilder();
        sb.append("Массив в обратном порядке: ");

        for (int i = container.length - 1; i >= 0; i--) {
            sb.append(container[i]).append(" ");
        }

        return sb.toString();
    }
}

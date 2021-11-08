package home_work_2.txt.arrays.task2_3;

import home_work_2.txt.arrays.task2_3.api.IArraysOperation;

public class WhileOperation implements IArraysOperation {
    public String showElements(int[] container) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        sb.append("Массив: ");

        while (i < container.length) {
            sb.append(container[i]).append(" ");
            i++;
        }

        return sb.toString();
    }

    public String showEverySecondElement(int[] container) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        sb.append("Каждый второй элемент массива: ");

        while (i < container.length) {
            sb.append(container[i]).append(" ");
            i += 2;
        }

        return sb.toString();
    }

    public String inverseArray(int[] container) {
        StringBuilder sb = new StringBuilder();
        int i = container.length - 1;
        sb.append("Массив в обратном порядке: ");

        while (i >= 0) {
            sb.append(container[i]).append(" ");
            i--;
        }

        return sb.toString();
    }
}

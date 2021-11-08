package home_work_2.txt.arrays.task2_3;

import home_work_2.txt.arrays.task2_3.api.IArraysOperation;

public class DoWhileOperation implements IArraysOperation {

    public String showElements(int[] container) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        sb.append("Массив: ");

        do {
            sb.append(container[i]).append(" ");
            i++;
        } while (i < container.length);

        return sb.toString();
    }

    public String showEverySecondElement(int[] container) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        sb.append("Каждый второй элемент массива: ");

        if (container.length < 2) {
            return sb.toString();
        }

        do {
            sb.append(container[i]).append(" ");
            i += 2;
        } while (i < container.length);

        return sb.toString();
    }

    public String inverseArray(int[] container) {
        StringBuilder sb = new StringBuilder();
        int i = container.length - 1;
        sb.append("Массив в обратном порядке: ");

        if (container.length == 0) {
            return sb.toString();
        }

        do {
            sb.append(container[i]).append(" ");
            i--;
        } while (i >= 0);

        return sb.toString();
    }
}

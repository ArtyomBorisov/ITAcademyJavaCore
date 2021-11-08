package home_work_2.txt.arrays.task2_3;

import home_work_2.txt.arrays.task2_3.api.IArraysOperation;

public class ForEachOperation implements IArraysOperation {
    public String showElements(int[] container) {
        StringBuilder sb = new StringBuilder();
        sb.append("Массив: ");

        for (int element : container) {
            sb.append(element).append(" ");
        }

        return sb.toString();
    }

    public String showEverySecondElement(int[] container) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        sb.append("Каждый второй элемент массива: ");

        for (int element: container) {
            if (i % 2 == 1) {
                sb.append(element).append(" ");
            }
            i++;
        }

        return sb.toString();
    }

    public String inverseArray(int[] container) {
        StringBuilder sb = new StringBuilder();
        sb.append("Массив в обратном порядке: ");

        int[] container2 = new int[container.length];
        int i = container.length - 1;

        for (int element: container) {
            container2[i] = element;
            i--;
        }

        for (int element: container2) {
            sb.append(element).append(" ");
        }

        return sb.toString();
    }
}

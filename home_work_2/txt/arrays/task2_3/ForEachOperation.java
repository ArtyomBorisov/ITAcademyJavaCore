package home_work_2.txt.arrays.task2_3;

public class ForEachOperation implements IArraysOperation {

    public void showElements(int[] container) {
        System.out.println("Массив: ");
        for (int element : container) {
            System.out.println(element);
        }
    }

    public void showEverySecondElement(int[] container) {
        int i = 0;
        String secondElements = "Каждый второй элемент массива: ";
        for (int element: container) {
            if (i % 2 == 1) {
                System.out.println(element);
            }
            i++;
        }
    }

    public void inverseArray(int[] container) {
        System.out.println("Массив в обратном порядке: ");
        int[] container2 = new int[container.length];
        int i = container.length - 1;
        for (int element: container) {
            container2[i] = element;
            i--;
        }
        for (int element: container2) {
            System.out.println(element);
        }
    }
}

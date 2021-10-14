package home_work_2.txt.arrays.task2_3;

public class ForOperation implements IArraysOperation {

    public void showElements(int[] container) {
        System.out.println("Массив: ");
        for (int i = 0; i < container.length; i++) {
            System.out.println(container[i]);
        }
    }

    public void showEverySecondElement(int[] container) {
        System.out.println("Каждый второй элемент массива: ");
        for (int i = 1; i < container.length; i += 2) {
            System.out.println(container[i]);
        }
    }

    public void inverseArray(int[] container) {
        System.out.println("Массив в обратном порядке: ");
        for (int i = container.length - 1; i >= 0; i--) {
            System.out.println(container[i]);
        }
    }
}

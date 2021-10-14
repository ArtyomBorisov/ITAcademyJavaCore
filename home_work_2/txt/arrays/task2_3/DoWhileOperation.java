package home_work_2.txt.arrays.task2_3;

public class DoWhileOperation implements IArraysOperation {

    public void showElements(int[] container) {
        int i = 0;
        System.out.println("Массив: ");
        do {
            System.out.println(container[i]);
            i++;
        } while (i < container.length);
    }

    public void showEverySecondElement(int[] container) {
        int i = 1;
        System.out.println("Каждый второй элемент массива: ");
        do {
            System.out.println(container[i]);
            i += 2;
        } while (i < container.length);
    }

    public void inverseArray(int[] container) {
        int i = container.length - 1;
        System.out.println("Массив в обратном порядке: ");
        do {
            System.out.println(container[i]);
            i--;
        } while (i >= 0);
    }
}

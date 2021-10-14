package home_work_2.txt.arrays.task2_3;

public class WhileOperation implements IArraysOperation {

    public void showElements(int[] container) {
        int i = 0;
        System.out.println("Массив: ");
        while (i < container.length) {
            System.out.println(container[i]);
            i++;
        }
    }

    public void  showEverySecondElement(int[] container) {
        int i = 1;
        System.out.println("Каждый второй элемент массива: ");
        while (i < container.length) {
            System.out.println(container[i]);
            i += 2;
        }
    }

    public void inverseArray(int[] container) {
        int i = container.length - 1;
        System.out.println("Массив в обратном порядке: ");
        while (i >= 0) {
            System.out.println(container[i]);
            i--;
        }
    }
}

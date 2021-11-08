package home_work_2.txt.arrays.task2_3.api;

public interface IArraysOperation {
    /**
     * метод для вывода массива целых чисел в строку
     * @param container массив
     * @return строку
     */
    String showElements(int[] container);

    /**
     * метод для вывода каждого второго элемента массива в строку
     * @param container массив
     * @return строку
     */
    String showEverySecondElement(int[] container);

    /**
     * метода для вывода массива целых чисел в обратном порядке
     * @param container массив
     * @return строку
     */
    String inverseArray(int[] container);
}

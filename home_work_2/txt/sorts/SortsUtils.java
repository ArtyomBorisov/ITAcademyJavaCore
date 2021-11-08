package home_work_2.txt.sorts;

public class SortsUtils {
    /**
     * метод для пузырьковой сортировки массива
     * @param array массив
     * @return отсортированный массив
     */
    public static int[] bubbleSort (int[] array) {
        boolean isSorted;
        int element;

        do {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    element = array[i+1];
                    array[i+1] = array[i];
                    array[i] = element;
                    isSorted = false;
                }
            }
        } while (!isSorted);

        return array;
    }

    /**
     * метод для шейкерной сортировки массива
     * @param array массив
     * @return отсортированный массив
     */
    public static int[] shakerSort (int[] array) {
        boolean isSorted;
        int element;

        do {
            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    element = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = element;
                    isSorted = false;
                }
            }

            for (int i = array.length - 1; i > 0 ; i--) {
                if (array[i] < array[i - 1]) {
                    element = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = element;
                    isSorted = false;
                }
            }
        } while (!isSorted);

        return array;
    }
}

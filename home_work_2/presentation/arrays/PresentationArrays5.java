package home_work_2.presentation.arrays;

public class PresentationArrays5 {
    /**
     * метод сжимает массив, удаляя элементы, принадлежащие интервалу [a, b] (включая эти значения);
     * неудалённые элементы сдвигаются влево, освобождённые элементы в конце массива заполняются нулями
     * @param arr массив
     * @param a начало интервала
     * @param b конец интервала
     * @return массив
     */
    public int[] deleteIntervalFromArray(int[] arr, int a, int b) {
        int[] resultArr = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < a || arr[i] > b) {
                resultArr[j] = arr[i];
                j++;
            }
        }

        return resultArr;
    }
}

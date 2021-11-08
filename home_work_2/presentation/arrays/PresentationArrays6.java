package home_work_2.presentation.arrays;

import java.util.Arrays;

public class PresentationArrays6 {
    /**
     * метод суммирует все ЦИФРЫ массива
     * @param array массив
     * @return сумма ЦИФР
     */
    public int sumDigitOfArray (int[] array) {
        int sum = 0;
        int[] tempArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < tempArray.length; i++) {

            if (tempArray[i] < 0) {
                tempArray[i] *= -1;
            }

            while (tempArray[i] != 0) {
                sum += tempArray[i] % 10;
                tempArray[i] /= 10;
            }
        }

        return sum;
    }
}

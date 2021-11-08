package home_work_2.presentation.arrays;

public class PresentationArrays1 {
    /**
     * метод находит сумму положительных чётных элементов массива
     * @param arr массив
     * @return сумма
     */
    public int sumEvenPlusNumbersOfArray(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        return sum;
    }
}

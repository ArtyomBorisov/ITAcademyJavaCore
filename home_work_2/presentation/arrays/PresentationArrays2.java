package home_work_2.presentation.arrays;

public class PresentationArrays2 {
    /**
     * метод находит максимальный из элементов массива с четными индексами
     * @param arr массив
     * @return максимальный элемент массива с четными индексами
     */
    public int findMaxNumberOfElementWithEvenIndex(int[] arr){
        if (arr.length == 0) {
            return 0;
        }

        int indexOfMaxNumber = 0;

        for (int i = indexOfMaxNumber + 2; i < arr.length; i += 2) {
            if (arr[i] > arr[indexOfMaxNumber]) {
                indexOfMaxNumber = i;
            }
        }

        return arr[indexOfMaxNumber];
    }
}

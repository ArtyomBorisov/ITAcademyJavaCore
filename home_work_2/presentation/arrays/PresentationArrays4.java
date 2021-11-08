package home_work_2.presentation.arrays;

public class PresentationArrays4 {
    /**
     * метод возвращает два наименьших элемента в массиве
     * @param arr массив
     * @return массив с двумя наименьшими элементами
     *         IllegalArgumentException, если передан массив, состоящий из 0 или 1 элемента
     */
    public int[] findTwoMinElements(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Передан массив, состоящий из 0 или 1 элемента");
        }

        int[] result = new int[2];
        int min1;
        int min2;

        if (arr[1] > arr[0]) {
            min1 = 0;
            min2 = 1;
        } else {
            min1 = 1;
            min2 = 0;
        }


        for (int i = 2; i < arr.length; i++){
            if (arr[i] < arr[min1]) {

                if (arr[min1] < arr[min2]){
                    min2 = min1;
                }
                min1 = i;

            } else if (arr[i] < arr[min2]) {
                min2 = i;
            }
        }

        result[0] = arr[min1];
        result[1] = arr[min2];

        return result;
    }
}

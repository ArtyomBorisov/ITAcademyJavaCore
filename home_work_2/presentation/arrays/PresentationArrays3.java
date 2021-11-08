package home_work_2.presentation.arrays;

public class PresentationArrays3 {
    /**
     * метод возвращает строку с элементами, которые меньше среднего арифметического всех чисел массива
     * @param arr массив
     * @return строка
     */
    public String findElementsLessAverage(int[] arr) {
        StringBuilder sb = new StringBuilder();

        int sum = 0;

        for (int elem : arr) {
            sum += elem;
        }

        double average = 1.0 * sum / arr.length;

        int identifier = -1;
        for (int elem : arr) {
            if (elem < average) {
                if (identifier != -1) {
                    sb.append(" ");
                }
                sb.append(elem);
                identifier = 1;
            }
        }

        return sb.toString();
    }
}

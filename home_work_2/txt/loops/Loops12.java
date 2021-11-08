package home_work_2.txt.loops;

import java.util.Scanner;

public class Loops12 {
    /**
     * метод проверяет на содержание целочисленного числа в строке
     * @param str строка
     * @return число
     *         IllegalArgumentException, если в строке не число или не целое число
     */
    public int validationAndParseNumber(String str){
        Scanner scan = new Scanner(str);

        if (scan.hasNextInt()){
            return Integer.parseInt(str);
        } else if (scan.hasNextDouble()) {
            throw new IllegalArgumentException("Введено не целое число");
        } else {
            throw new IllegalArgumentException("Введено не число");
        }
    }

    /**
     * метод делит число на цифры
     * @param num число
     * @return массив цифр
     */
    public int[] separateNumber(int num){
        if (num < 0){
            num *= -1;
        }

        int tmp = num;
        int count = 0;
        
        while (tmp > 0){
            tmp /= 10;
            count++;
        }
        
        int[] numbers = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = num % 10;
            num /= 10;
        }
        
        int[] numbersResult = new int[count];

        for (int i = 0; i < numbersResult.length; i++) {
            numbersResult[i] = numbers[count - 1];
            count--;
        }
        
        return numbersResult;
    }

    /**
     * метод перемножает массив цифр
     * @param numbers массив цифр
     * @return строку типа "1 * 2 * 5 * 3 = 30"
     *         IllegalArgumentException, если массив содержит двузначные числа
     */
    public String multiply(int[] numbers) {
        for (int number : numbers) {
            if (number > 9) {
                throw new IllegalArgumentException("Передан массив не цифр");
            }
        }

        int result = 1;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            builder.append(numbers[i]);

            if (i < numbers.length - 1){
                builder.append(" * ");
            }

            result *= numbers[i];
        }

        return builder.append(" = ").append(result).toString();
    }
}

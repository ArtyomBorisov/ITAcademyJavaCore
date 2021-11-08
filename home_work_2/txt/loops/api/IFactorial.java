package home_work_2.txt.loops.api;

public interface IFactorial {
    /**
     * метод проверяет строку, если строка содержит целое число, метод возвращает это число
     * @param arg строка
     * @return число
     *         IllegalArgumentException - если строка содержит дробное число или не является числом
     */
    long validationAndParseNumber(String arg);

    /**
     * метод для вычисления факториала числа
     * @param num число
     * @return строку в формате "1 * 2 * 3 * 4 * 5 = 120"
     *         IllegalArgumentException - если число меньше или равно 0
     *         ArithmeticException - если результат вышел за пределы Long
     */
    String factorial(long num);
}

package home_work_2.txt.loops;

public class Loops14 {
    /**
     * метод перемножает число типа long до переполнения
     * @param num число
     * @return строку, содержащую значения ДО и ПОСЛЕ переполнения
     */
    public String overflow(long num) {
        long res = 1;
        int identifier = 1;

        while(identifier != -1) {
            try {
                res = Math.multiplyExact(res , num);
            } catch (ArithmeticException e) {
                identifier = -1;
            }
        }

        return "Произошло переполнение. Значение до переполнения: " + res + ". Значение после переполнения: " + res * num;
    }
}

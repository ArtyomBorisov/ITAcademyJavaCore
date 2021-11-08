package home_work_2.txt.loops;

public class Loops13 {
    /**
     * метод возводит число в положительную степень
     * @param a возводимое число (основание)
     * @param b степень
     * @return строку типа "2.0 ^ 5 = 32.0"
     */
    public String pow(double a, int b) {
        if (b <= 0) {
            throw new IllegalArgumentException("Степень строго больше нуля");
        }

        double result = a;

        for (int i = 1; i < b; i++) {
            result *= a;
        }

        return  a + " ^ " + b + " = " + result;
    }
}

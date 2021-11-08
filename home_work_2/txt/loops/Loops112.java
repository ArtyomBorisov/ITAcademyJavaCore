package home_work_2.txt.loops;

import home_work_2.txt.loops.api.IFactorial;

public class Loops112 implements IFactorial {
    public long validationAndParseNumber(String arg){
        try {
            return Long.parseLong(arg);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Передано дробное число или не число\n" + e);
        }
    }

    public String factorial (long num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Передано число меньше или равное нулю");
        }
        StringBuilder builder = new StringBuilder();
        builder.append("1");

        for (int i = 2; i <= num; i++) {
            builder.append(" * ").append(i);
        }

        return builder.append(" = ").append(recursion(num)).toString();
    }

    private long recursion(long num){
        long result = 1;

        if (num == 1) {
            return result;
        }

        try {
            result = Math.multiplyExact(num, recursion(num - 1));
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Результат вышел за пределы Long\n" + e);
        }

        return result;
    }
}

package home_work_2.txt.loops;

import home_work_2.txt.loops.api.IFactorial;

public class Loops111 implements IFactorial {
    public long validationAndParseNumber(String arg){
        try {
            return Long.parseLong(arg);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Передано дробное число или не число\n" + e);
        }
    }

    public String factorial(long num){
        if (num <= 0) {
            throw new IllegalArgumentException("Передано число меньше или равное нулю");
        }

        long result = 1;
        StringBuilder builder = new StringBuilder();
        builder.append("1");

        for (long i = 2; i <= num; i++){
            try {
                result = Math.multiplyExact(result, i);
            } catch (ArithmeticException e) {
                throw new ArithmeticException("Результат вышел за пределы Long\n" + e);
            }
            builder.append(" * ").append(i);
        }

         return builder.append(" = ").append(result).toString();
    }
}

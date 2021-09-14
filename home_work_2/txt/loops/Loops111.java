package home_work_2.txt.loops;

public class Loops111 {
    public static void main(String[] args) {
        long num = Long.parseLong(args[0]);
        if (num <= 0) {
            System.out.println("В аргумент нужно передать целое положительное число");
            return;
        }
        long result = 1;
        String display = "1";

        for (long i = 2; i <= num; i++){
            try {
                result = Math.multiplyExact(result, i);
            } catch (ArithmeticException e) {
                System.out.println("Результат вышел за пределы Long");
                return;
            }
            display += " * " + i;
        }

        System.out.printf("%s = %d", display, result);
    }
}

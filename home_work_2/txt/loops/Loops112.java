package home_work_2.txt.loops;

public class Loops112 {
    public static void main(String[] args) {
        long num = Long.parseLong(args[0]);

        if (num <= 0) {
            System.out.println("В аргумент нужно передать целое положительное число");
            return;
        }

        String text = "1";
        for (int i = 2; i <= num; i++) {
            text = text + " * " + i;
        }

        System.out.println(text + " = " + recursion(num));
    }

    public static Long recursion(long num) {
        long result = 1;
        if (num == 1) {
            return result;
        }
        result = num * recursion(num - 1);
        return result;
    }
}

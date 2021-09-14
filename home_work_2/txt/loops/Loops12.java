package home_work_2.txt.loops;

public class Loops12 {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt(args[0]);
            System.out.println("Число " + number);
            int result = 1;
            String text = "";

            while (number > 9) {
                text = " * " + number % 10 + text;
                result *= number % 10;
                number /= 10;
            }

            text = number % 10 + text;
            System.out.println(text + " = " + result);

        } catch (IllegalArgumentException e) {
            try {
                double number = Double.parseDouble(args[0]);
                System.out.println("Введено не целое число");
            } catch (IllegalArgumentException hzhz) {
                System.out.println("Введено не число");
            }
        }
    }
}

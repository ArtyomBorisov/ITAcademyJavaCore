package home_work_1;
import java.util.Scanner;
//Определить нечетное число
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число:");
        int a = scan.nextInt();
        System.out.print("Введите второе число:");
        int b = scan.nextInt();

        if (a % 2 == b % 2) {
            a++;
            System.out.println("Оба числа одинаковой чётности. Первое число увеличено на 1: " + a + ".");
        }

        if (a % 2 == 1) {
            System.out.println("Первое число нечётное:" + a);
        } else {
            System.out.println("Второе число нечётное:" + b);
        }
    }
}

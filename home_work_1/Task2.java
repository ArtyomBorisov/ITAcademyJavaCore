package home_work_1;
import java.util.Scanner;
//Среди трех чисел найти среднее
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите три числа:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a == b || a == c || b == c) {
            System.out.println("Числа должны быть разными!");
            return;
        }

        if (a > c && a < b) {
            System.out.println("Среднее: " + a);
        } else if (a > b && a < c) {
            System.out.println("Среднее: " + a);
        } else if (b > a && b < c) {
            System.out.println("Среднее: " + b);
        } else if (b > c && b < a) {
            System.out.println("Среднее: " + b);
        } else {
            System.out.println("Среднее: " + c);
        }

    }
}

package home_work_1;
import java.util.Scanner;
//Проверка делимости одного числа на другое
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите два числа:");
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("Числа не должны быть равны 0!");
            return;
        }

        if (a % b == 0) {
            System.out.println("Число " + a + " делится нацело на число " + b);
        } else {
            System.out.println("Число " + a + " НЕ делится нацело на число " + b);
            System.out.println("Остаток: " + a % b);
        }
        System.out.println("Частное: " + a / b);
    }
}

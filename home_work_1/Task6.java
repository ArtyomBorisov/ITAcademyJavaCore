package home_work_1;
import java.util.Scanner;
//Определить високосный год или нет
public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scan.nextInt();
        String yes = "Високосный";
        String no = "Обычный";

        if (year % 4 != 0) {
            System.out.println(no);
        } else if (year % 100 != 0 || year % 400 == 0) {
            System.out.println(yes);
        } else {
            System.out.println(no);
        }
    }
}


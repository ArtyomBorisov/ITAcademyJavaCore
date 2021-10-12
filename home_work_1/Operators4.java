package home_work_1;

import java.util.Scanner;

public class Operators4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Будний день? true или false");
        boolean weekday = scan.nextBoolean();
        System.out.println("Отпуск? true или false");
        boolean vacation = scan.nextBoolean();
        System.out.println(sleepIn(weekday , vacation));
    }

    public static String sleepIn (boolean weekday , boolean vacation) {
        if (!weekday || vacation) {
            return "Можно спать дальше";
        }
        return "Пора идти на работу";
    }
}
package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Operators5_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ты кто? ");
        String name = scan.nextLine();
        String wait = "Я тебя так долго ждал";

        if (Objects.equals(name , "Вася")) {
            System.out.println("Привет!");
            System.out.println(wait);
        } else if (Objects.equals(name , "Анастасия")) {
            System.out.println(wait);
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}

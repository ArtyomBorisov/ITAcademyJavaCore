package home_work_1;

import java.util.Scanner;

public class Operators5_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ты кто? ");
        String name = scan.nextLine();
        String wait = "Я тебя так долго ждал";

        switch (name){
            case "Вася":
                System.out.println("Привет!");
                System.out.println(wait);
                break;
            case "Анастасия":
                System.out.println(wait);
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}

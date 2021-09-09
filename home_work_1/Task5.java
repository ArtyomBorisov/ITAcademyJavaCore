package home_work_1;
import java.util.Scanner;
//Буква или иной символ?
public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scan.nextInt();
        char A = 'A';
        char Z = 'Z';
        char a = 'a';
        char z = 'z';

        if (num >= A && num <= Z) {
            System.out.println("Это буква " + (char) num);
        } else if (num >= a && num <= z) {
            System.out.println("Это буква " + (char) num);
        } else  {
            System.out.println("Это не буква, а символ " + (char) num);
        }
    }
}


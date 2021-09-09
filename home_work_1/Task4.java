package home_work_1;
import java.util.Objects;
import java.util.Scanner;
//Перевести байты в килобайты или наоборот
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Число:");
        int num = scan.nextInt();
        scan.nextLine();
        System.out.println("Перевести в байты (b) или килобайты (k): ");
        String a = scan.nextLine();

        if (Objects.equals(a , "b")) {
            System.out.println(num + " Кб = " + num * 1024 + " байт");
        } else if (Objects.equals(a , "k")) {
            System.out.println(num + " байт = " + (double) num / 1024 + " Кб");
        } else {
            System.out.println("Нужно ввести или b, или k!");
        }
    }
}

package home_work_2.txt.loops;

public class Loops15 {
    public static void main(String[] args) {
        System.out.println("Таблица умножения");
        printRow(2 , 5);
        System.out.println();
        printRow(6 , 9);
    }

    static void printRow (int from, int to) {
        for (int i = 1; i <= 10; i++) {
            for (int j = from; j <= to; j++) {
                if (j == from) {
                    System.out.printf("%s x %-2s = %-2s", j, i, j * i);
                } else {
                    System.out.printf("%5s x %-2s = %-2s", j, i, j * i);
                }
            }
            System.out.println();
        }
    }
}

package home_work_2.txt.loops;

public class Loops15 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%s x %-2s = %-2s", 2, numbers[i], 2 * numbers[i]);
            System.out.printf("%10s x %-2s = %-2s", 3, numbers[i], 3 * numbers[i]);
            System.out.printf("%10s x %-2s = %-2s", 4, numbers[i], 4 * numbers[i]);
            System.out.printf("%10s x %-2s = %-2s\n", 5, numbers[i], 5 * numbers[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%s x %-2s = %-2s", 6, numbers[i], 6 * numbers[i]);
            System.out.printf("%10s x %-2s = %-2s", 7, numbers[i], 7 * numbers[i]);
            System.out.printf("%10s x %-2s = %-2s", 8, numbers[i], 8 * numbers[i]);
            System.out.printf("%10s x %-2s = %-2s\n", 9, numbers[i], 9 * numbers[i]);
        }

    }
}

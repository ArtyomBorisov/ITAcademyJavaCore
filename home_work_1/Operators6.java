package home_work_1;

public class Operators6 {
    public static void main(String[] args) {
        int n[] = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(createPhoneNumber(n));
    }

    public static String createPhoneNumber (int[] n) {
        String number = "(" + n[0] + n[1] + n[2] + ") " + n[3] + n[4] + n[5] + "-" + n[6] + n[7] + n[8] + n[9];
        return (number);
    }
}
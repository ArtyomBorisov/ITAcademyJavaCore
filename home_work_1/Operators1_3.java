package home_work_1;

public class Operators1_3 {
    public static void main(String[] args) {
        int a = -42; //в двоичной системе: 11111111111111111111111111010110
        int b = -15; //в двоичной системе: 11111111111111111111111111110001
        System.out.println("a=" + a + " (" + Integer.toBinaryString(a) + "), b=" + b + " (" + Integer.toBinaryString(b) + ")");

        int c = a | b; // a = 11111111111111111111111111010110, b = 11111111111111111111111111110001, c = 11111111111111111111111111110111
        System.out.println("Оператор OR (a|b) :" + c + " (" + Integer.toBinaryString(c) + ")");

        c = a & b; // a = 11111111111111111111111111010110, b = 11111111111111111111111111110001, c = 11111111111111111111111111010000
        System.out.println("Оператор AND (a&b) :" + c + " (" + Integer.toBinaryString(c) + ")");

        c = a ^ b; // a = 11111111111111111111111111010110, b = 11111111111111111111111111110001, c = 100111
        System.out.println("Оператор XOR (a^b) :" + c + " (" + Integer.toBinaryString(c) + ")");

        c = ~a; // a = 11111111111111111111111111010110, b = 11111111111111111111111111110001, c = 101001
        System.out.println("Оператор NOT (~a) :" + c + " (" + Integer.toBinaryString(c) + ")");

        c = a << b; // a = 11111111111111111111111111010110, b = 11111111111111111111111111110001, c = 11111111101011000000000000000000
        System.out.println("Оператор сдвига влево (a<<b) :" + c + " (" + Integer.toBinaryString(c) + ")");

        c = a >> b; // a = 11111111111111111111111111010110, b = 11111111111111111111111111110001, c = 11111111111111111111111111111111
        System.out.println("Оператор сдвига вправо (a>>b) :" + c + " (" + Integer.toBinaryString(c) + ")");

        c = a >>> b; // a = 11111111111111111111111111010110, b = 11111111111111111111111111110001, c = 111111111111111
        System.out.println("Нулевой оператор сдвига вправо (a>>>b) :" + c + " (" + Integer.toBinaryString(c) + ")");
    }
}

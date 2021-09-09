package home_work_1;

public class Operators1_2 {
    public static void main(String[] args) {
        int a = 42; //в двоичной системе: 00101010
        int b = 15; //в двоичной системе: 00001111
        System.out.println("a=" + a + " (" + Integer.toBinaryString(a) + "), b=" + b + " (" + Integer.toBinaryString(b) + ")");

        int c = a | b; // a = 101010, b = 1111, c = 101111; возвращает 1, если бит в любом операнде равен 1
        System.out.println("Оператор OR (a|b) :" + c + " (" + Integer.toBinaryString(c) + ")");

        c = a & b; // a = 101010, b = 1111, c = 1010; возвращает 1, если бит в обоих операндах равен 1
        System.out.println("Оператор AND (a&b) :" + c + " (" + Integer.toBinaryString(c) + ")");

        c = a ^ b; // a = 101010, b = 1111, c = 100101; возвращает 1, если бит только в одном операнде равен 1
        System.out.println("Оператор XOR (a^b) :" + c + " (" + Integer.toBinaryString(c) + ")");

        c = ~a; // a = 101010, c = 11111111111111111111111111010101; инвертирует биты (меняет 1 на 0, 0 на 1)
        System.out.println("Оператор NOT (~a) :" + c + " (" + Integer.toBinaryString(c) + ")");

        c = a << b; // a = 101010, b = 15, c = 101010000000000000000; сдвигает биты на заданное количество влево
        System.out.println("Оператор сдвига влево (a<<b) :" + c + " (" + Integer.toBinaryString(c) + ")");

        c = a >> b; // a = 101010, b = 15, c = 0; сдвигает биты на заданное количество вправо, старшие биты заполняются предыдущим значением (если число отрицательное, т.е. первый бит равен 1)
        System.out.println("Оператор сдвига вправо (a>>b) :" + c + " (" + Integer.toBinaryString(c) + ")");

        c = a >>> b; // a = 101010, b = 15, c = 0; сдвигает биты на заданное количество вправо, старшие биты заполняются нулями
        System.out.println("Нулевой оператор сдвига вправо (a>>>b) :" + c + " (" + Integer.toBinaryString(c) + ")");
    }
}

package home_work_1;

import home_work_1.api.ICommunicationPrinter;
import java.util.Objects;

public class Operators5_2 implements ICommunicationPrinter {
    @Override
    public String welcome(String name) {
        String wait = "Я тебя так долго ждал";

        if (Objects.equals(name , "Вася")) {
            return "Привет!\n" + wait;
        } else if (Objects.equals(name , "Анастасия")) {
            return wait;
        } else {
            return "Добрый день, а вы кто?";
        }
    }
}

package home_work_1;

import home_work_1.api.ICommunicationPrinter;
import java.util.Objects;

public class Operators5_1 implements ICommunicationPrinter {
    @Override
    public String welcome(String name) {
        String wait = "Я тебя так долго ждал";

        if (Objects.equals(name , "Вася")) {
            return "Привет!\n" + wait;
        }

        if (Objects.equals(name , "Анастасия")) {
            return wait;
        }

        return "Добрый день, а вы кто?";
    }
}

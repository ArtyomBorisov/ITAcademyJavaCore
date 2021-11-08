package home_work_1;

import home_work_1.api.ICommunicationPrinter;

public class Operators5_3 implements ICommunicationPrinter {
    @Override
    public String welcome(String name) {
        String wait = "Я тебя так долго ждал";

        switch (name){
            case "Вася":
                return "Привет!\n" + wait;
            case "Анастасия":
                return wait;
            default:
                return "Добрый день, а вы кто?";
        }
    }
}

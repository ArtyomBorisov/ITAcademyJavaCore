package test.home_work_1.api;

import home_work_1.api.ICommunicationPrinter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public interface ICommunicationPrinterTest<T extends ICommunicationPrinter> {
    T iCommunicationPrinter();

    @DisplayName("Тест метода String welcome (String name)")
    @ParameterizedTest(name = "{index}. Имя - \"{1}\". Ожидаемый ответ - \"{0}\".")
    @MethodSource("welcomeArguments")
    default void welcome (String result, String name) {
        assertEquals(result, iCommunicationPrinter().welcome(name));
    }

    static Stream<Arguments> welcomeArguments() {
        String whoAreYou = "Добрый день, а вы кто?";
        String wait = "Я тебя так долго ждал";

        return Stream.of(
                arguments("Привет!\n" + wait, "Вася"),
                arguments(wait, "Анастасия"),

                arguments(whoAreYou, "ВАся"),
                arguments(whoAreYou, "Василий"),
                arguments(whoAreYou, "Vasya"),
                arguments(whoAreYou, "Иван"),
                arguments(whoAreYou, "555"),
                arguments(whoAreYou, "!!!@@@"),
                arguments(whoAreYou, ""),
                arguments(whoAreYou, "Pavel"),
                arguments(whoAreYou, "            "),
                arguments(whoAreYou, "\n")
        );
    }
}

package test.home_work_1;

import home_work_1.Operators4;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Operators4Test {
    @DisplayName("Тест метода String sleepIn (boolean weekday , boolean vacation)")
    @ParameterizedTest(name = "{index}. Будний день = \"{1}\", отпуск = \"{2}\", ожидаемый ответ = \"{0}\".")
    @MethodSource("sleepArguments")
    void sleep(String str, boolean b1, boolean b2) {
        assertEquals(str, Operators4.sleepIn(b1, b2));
    }

    public static Stream<Arguments> sleepArguments() {
        String messageSleep = "Можно спать дальше";
        String messageWork = "Пора идти на работу";

        return Stream.of(
                arguments(messageSleep, true, true),
                arguments(messageWork, true, false),
                arguments(messageSleep, false, true),
                arguments(messageSleep, false, false)
        );
    }
}

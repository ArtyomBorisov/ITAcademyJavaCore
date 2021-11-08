package test.home_work_1;

import home_work_1.Operators6;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Operators6Test {
    @DisplayName("Тест метода String createPhoneNumber (int[] n)")
    @ParameterizedTest(name = "{index}. Ожидаем получить номер телефона \"{0}\" из массива {1}")
    @MethodSource("sleepArguments")
    void createPhoneNumber(String str, int[] num) {
        assertEquals(str, Operators6.createPhoneNumber(num));
    }

    static Stream<Arguments> sleepArguments() {
        return Stream.of(
                arguments("(123) 456-7890", new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}),
                arguments("(222) 457-7777", new int[] {2, 2, 2, 4, 5, 7, 7, 7, 7, 7}),
                arguments("(123) 456-7000", new int[] {1, 2, 3, 4, 5, 6, 7, 0, 0, 0})
        );
    }
}

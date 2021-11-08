package test.home_work_2.txt.loops;

import home_work_2.txt.loops.Loops13;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Loops13Test {
    @DisplayName("Тест метода String pow(double a, int b), ВАЛИДНЫЕ аргументы")
    @ParameterizedTest(name = "{index}. Введено: \"{1}\" и \"{2}\". Ожидаемый ответ: \"{0}\".")
    @MethodSource
    void pow(String res, double a, int b) {
        Loops13 loops13 = new Loops13();
        assertEquals(res, loops13.pow(a, b));
    }

    static Stream<Arguments> pow() {
        return Stream.of(
                arguments("18.0 ^ 5 = 1889568.0", 18, 5),
                arguments("7.5 ^ 2 = 56.25", 7.5, 2),
                arguments("2.0 ^ 4 = 16.0", 2, 4),
                arguments("1.0 ^ 1 = 1.0", 1, 1),
                arguments("1.0 ^ 2 = 1.0", 1, 2),
                arguments("0.0 ^ 4 = 0.0", 0, 4),
                arguments("0.0 ^ 4 = 0.0", -0, 4),
                arguments("-5.0 ^ 4 = 625.0", -5.0, 4),
                arguments("-5.0 ^ 3 = -125.0", -5d, 3)
        );
    }

    @DisplayName("Тест метода String pow(double a, int b), НЕВАЛИДНЫЕ аргументы")
    @ParameterizedTest(name = "{index}. Введено: \"{0}\" и \"{1}\". Ожидаемая ошибка \"IllegalArgumentException\".")
    @MethodSource("powIncorrectArguments")
    void powExceptions(double a, int b) {
        Loops13 loops13 = new Loops13();
        assertThrows(IllegalArgumentException.class, () -> {
            loops13.pow(a, b);
        });
    }

    static Stream<Arguments> powIncorrectArguments(){
        return Stream.of(
                arguments(4, -2),
                arguments(3, -555),
                arguments(7, 0),
                arguments(-5, 0),
                arguments(-7, -2)
        );
    }
}

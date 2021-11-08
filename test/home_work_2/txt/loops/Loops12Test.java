package test.home_work_2.txt.loops;

import home_work_2.txt.loops.Loops12;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.security.spec.NamedParameterSpec;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Loops12Test {
    @DisplayName("Тест метода int validationAndParseNumber(String str), ВАЛИДНЫЕ аргументы")
    @ParameterizedTest(name = "{index}. Передали строку: \"{1}\". Ожидаем число: \"{0}\".")
    @MethodSource("validationArguments")
    public void validationAndParseNumber(int expected, String str){
        Loops12 loops12 = new Loops12();
        assertEquals(expected, loops12.validationAndParseNumber(str));
    }

    static Stream<Arguments> validationArguments(){
        return Stream.of(
                arguments(5, "5"),
                arguments(1578, "1578"),
                arguments(-1538, "-1538"),
                arguments(0, "0")
        );
    }

    @DisplayName("Тест метода int validationAndParseNumber(String str), НЕВАЛИДНЫЕ аргументы")
    @ParameterizedTest(name = "{index}. Передали строку: \"{0}\". Ожидаем ошибку IllegalArgumentException.")
    @MethodSource("validationIncorrectArguments")
    public void validationAndParseNumberExceptions(String str){
        Loops12 loops12 = new Loops12();
        assertThrows(IllegalArgumentException.class, () -> {
           loops12.validationAndParseNumber(str);
        });
    }

    static Stream<Arguments> validationIncorrectArguments(){
        return Stream.of(
                arguments("99.2"),
                arguments("Привет"),
                arguments("-99.2"),
                arguments("99,2"),
                arguments("-99,2"),
                arguments(""),
                arguments("!!!"),
                arguments("0,0")
        );
    }

    @DisplayName("Тест метода int[] separateNumber(int num)")
    @ParameterizedTest(name = "{index}. Передали: {1}. Ожидаем массив: {0}.")
    @MethodSource("separateArguments")
    public void separateNumber(int[] numbers, int num){
        Loops12 loops12 = new Loops12();
        assertArrayEquals(numbers, loops12.separateNumber(num));
    }

    static Stream<Arguments> separateArguments(){
        return Stream.of(
                arguments(new int[]{1, 2, 3, 4, 5}, 12345),
                arguments(new int[]{9, 0, 0, 1, 5, 8, 7}, 9001587),
                arguments(new int[]{}, 0),
                arguments(new int[]{1}, 1),
                arguments(new int[]{8, 7}, 87),
                arguments(new int[]{8, 7}, -87),
                arguments(new int[]{1}, -1)
        );
    }

    static Stream<Arguments> multiply() {
        return Stream.of(
                arguments("1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080", "181232375")
                //arguments(, "99,2"),
                //arguments(notNumber, "Привет"),
                //arguments("1 * 4 * 7 * 5 * 2 * 5 * 7 = 9800", "1475257"),
                //arguments(notInteger, "123.55"),
                //arguments(notNumber, "Эй, Арнольд")
        );
    }
}

package test.home_work_2.txt.loops.api;

import home_work_2.txt.loops.api.IFactorial;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public interface IFactorialTest<T extends IFactorial> {

    T iFactorial();

    @DisplayName("Тест метода long validationAndParseNumber(String arg), ВАЛИДНЫЕ аргументы")
    @ParameterizedTest(name = "{index}. Ожидаем: {0}. Передаём: {1}.")
    @MethodSource("validationCorrectArguments")
    default void validationAndParseNumber(long result, String str){
        assertEquals(result, iFactorial().validationAndParseNumber(str));
    }

    static Stream<Arguments> validationCorrectArguments(){
        return Stream.of(
                arguments(6, "6"),
                arguments(15755, "15755"),
                arguments(155, "155"),
                arguments(10000, "10000"),
                arguments(-10000, "-10000"),
                arguments(0, "0")
        );
    }

    @DisplayName("Тест метода long validationAndParseNumber(String arg), НЕВАЛИДНЫЕ аргументы")
    @ParameterizedTest(name = "{index}. Ожидаем ошибку IllegalArgumentException. Передаём: {0}.")
    @MethodSource("validationIncorrectArguments")
    default void validationAndParseNumberExceptions(String str){
        assertThrows(IllegalArgumentException.class, () -> {
            iFactorial().validationAndParseNumber(str);
        });
    }

    static Stream<Arguments> validationIncorrectArguments(){
        return Stream.of(
                arguments("15.5"),
                arguments("15,5"),
                arguments("-15.5"),
                arguments("-15,5"),
                arguments("привет")
        );
    }

    @DisplayName("Тест метода String factorial(long num), ВАЛИДНЫЕ аргументы")
    @ParameterizedTest(name = "{index}. Передали: \"{1}\". Ожидаем: \"{0}\"")
    @MethodSource("factorialCorrectArguments")
    default void factorial(String result, long num){
        assertEquals(result, iFactorial().factorial(num));
    }

    static Stream<Arguments> factorialCorrectArguments(){
        return Stream.of(
                arguments("1 * 2 * 3 * 4 * 5 = 120", 5),
                arguments("1 * 2 * 3 = 6", 3),
                arguments("1 = 1", 1)
        );
    }

    @DisplayName("Тест метода String factorial(long num), НЕВАЛИДНЫЕ аргументы или результат переполнен")
    @ParameterizedTest(name = "{index}. Передали: \"{1}\". Ожидаем: \"{0}\"")
    @MethodSource("factorialIncorrectArguments")
    default void factorialExceptions(Throwable expected, long num){
        assertThrows(expected.getClass(), () -> {
            iFactorial().factorial(num);
        });
    }

    static Stream<Arguments> factorialIncorrectArguments(){
        return Stream.of(
                arguments(new IllegalArgumentException(), -5),
                arguments(new IllegalArgumentException(), 0),
                arguments(new ArithmeticException(), 1000)
        );
    }
}

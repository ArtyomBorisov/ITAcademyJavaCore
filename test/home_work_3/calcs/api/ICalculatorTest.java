package test.home_work_3.calcs.api;

import home_work_3.calcs.api.ICalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public interface ICalculatorTest<T extends ICalculator> {
    T iCalc();

    @DisplayName("Тест калькулятора на примере \"4.1 + 15 * 7 + (28 / 5) ^ 2\"")
    @Test
    default void testExampleFromTxt() {
        double step1 = iCalc().div(28, 5);
        double step2 = iCalc().degree(step1, 2);
        double step3 = iCalc().multipl(15, 7);
        double step4 = iCalc().plus(4.1, step3);
        double step5 = iCalc().plus(step4, step2);
        Assertions.assertEquals(140.45999999999998, step5);
    }

    @DisplayName("Тест метода double plus (double a , double b)")
    @ParameterizedTest(name = "{index}. Передали слагаемые: {1} и {2}. Ожидаем: {0}.")
    @MethodSource
    default void plus(double expected, double a, double b) {
        Assertions.assertEquals(expected, iCalc().plus(a, b));
    }

    static Stream<Arguments> plus() {
        return Stream.of(
                Arguments.arguments(15, 5, 10),
                Arguments.arguments(-5.5, 5, -10.5),
                Arguments.arguments(10.8, 0, 10.8),
                Arguments.arguments(0, 0, 0),
                Arguments.arguments(-25, -13, -12)
        );
    }

    @DisplayName("Тест метода double minus (double a , double b)")
    @ParameterizedTest(name = "{index}. Передали уменьшаемое {1}, вычитаемое {2}. Ожидаем: {0}")
    @MethodSource
    default void minus(double expected, double a, double b) {
        Assertions.assertEquals(expected, iCalc().minus(a, b));
    }

    static Stream<Arguments> minus() {
        return Stream.of(
                Arguments.arguments(5, 15, 10),
                Arguments.arguments(25.0, 15.0, -10.0),
                Arguments.arguments(-25, -15, 10),
                Arguments.arguments(-5, 10, 15),
                Arguments.arguments(15, 15, 0),
                Arguments.arguments(15, 0, -15),
                Arguments.arguments(0, 0, 0)
        );
    }

    @DisplayName("Тест метода double multipl (double a , double b)")
    @ParameterizedTest(name = "{index}. Передали множители: {1} и {2}. Ожидаем: {0}.")
    @MethodSource
    default void multipl(double expected, double a, double b) {
        Assertions.assertEquals(expected, iCalc().multipl(a, b));
    }

    static Stream<Arguments> multipl() {
        return Stream.of(
                Arguments.arguments(25, 5, 5),
                Arguments.arguments(0, 5, 0),
                Arguments.arguments(-25, 5, -5),
                Arguments.arguments(25, -5, -5),
                Arguments.arguments(0, 0, 0),
                Arguments.arguments(-0.0, -14, 0)
        );
    }

    @DisplayName("Тест метода double div (double a , double b)")
    @ParameterizedTest(name = "{index}. Передали делимое {1}, делитель {2}. Ожидаем: {0}.")
    @MethodSource
    default void div(double expected, double a, double b) {
        Assertions.assertEquals(expected, iCalc().div(a, b));
    }

    static Stream<Arguments> div() {
        return Stream.of(
                Arguments.arguments(5, 25, 5),
                Arguments.arguments(-5, 25, -5),
                Arguments.arguments(0, 0, 5),
                Arguments.arguments(40, 100.0, 2.5),
                Arguments.arguments(Double.POSITIVE_INFINITY, 100.0, 0),
                Arguments.arguments(Double.NEGATIVE_INFINITY, -100.0, 0)
        );
    }

    @DisplayName("Тест метода double sqrt (double a)")
    @ParameterizedTest(name = "{index}. Передали число {1}. Ожидаем {0}.")
    @MethodSource
    default void sqrt(double expected, double a) {
        Assertions.assertEquals(expected, iCalc().sqrt(a));
    }

    static Stream<Arguments> sqrt() {
        return Stream.of(
                Arguments.arguments(5, 25),
                Arguments.arguments(4, 16),
                Arguments.arguments(0, 0),
                Arguments.arguments(Double.NaN, -1555)
        );
    }

    @DisplayName("Тест метода double degree (double a , int b)")
    @ParameterizedTest(name = "{index}. Передали возводимое число {1}, степень {2}. Ожидаем {0}.")
    @MethodSource
    default void degree(double expected, double a, int b) {
        Assertions.assertEquals(expected, iCalc().degree(a, b));
    }

    static Stream<Arguments> degree() {
        return Stream.of(
                Arguments.arguments(4, 2, 2),
                Arguments.arguments(1, 1, 5),
                Arguments.arguments(1, 1, -15),
                Arguments.arguments(1.0 / 27, 3, -3),
                Arguments.arguments(-27, -3, 3),
                Arguments.arguments(16, -4, 2),
                Arguments.arguments(0, 0, 2),
                Arguments.arguments(Double.POSITIVE_INFINITY, 0, -2)
        );
    }

    @DisplayName("Тест метода double module (double a)")
    @ParameterizedTest(name = "{index}. Передали число {1}. Ожидаем {0}.")
    @MethodSource
    default void module(double expected, double a) {
        Assertions.assertEquals(expected, iCalc().module(a));
    }

    static Stream<Arguments> module() {
        return Stream.of(
                Arguments.arguments(17, -17.0),
                Arguments.arguments(0, 0),
                Arguments.arguments(17, 17.0)
        );
    }
}

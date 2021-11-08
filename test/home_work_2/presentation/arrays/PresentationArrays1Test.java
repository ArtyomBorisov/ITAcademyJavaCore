package test.home_work_2.presentation.arrays;

import home_work_2.presentation.arrays.PresentationArrays1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PresentationArrays1Test {
    @DisplayName("Тест метода int sumEvenPlusNumbersOfArray(int[] arr)")
    @ParameterizedTest(name = "{index}. Передаём массив: {1}. Ожидаем ответ: {0}.")
    @MethodSource
    public void sumEvenPlusNumbersOfArray(int expected, int[] arr) {
        PresentationArrays1 presentationArrays1 = new PresentationArrays1();
        assertEquals(expected, presentationArrays1.sumEvenPlusNumbersOfArray(arr));
    }

    static Stream<Arguments> sumEvenPlusNumbersOfArray() {
        return Stream.of(
                arguments(442, new int[]{15, 66, 8, 0, 24, 100, 200, 44}),
                arguments(68, new int[]{-15, 66, -8, 0, -2, 2}),
                arguments(0, new int[]{}),
                arguments(0, new int[]{0}),
                arguments(0, new int[]{1, 1, 1, 1, 1})
        );
    }
}

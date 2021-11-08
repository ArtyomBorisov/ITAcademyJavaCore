package test.home_work_2.presentation.arrays;

import home_work_2.presentation.arrays.PresentationArrays5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PresentationArrays5Test {
    @DisplayName("Тест метода int[] deleteIntervalFromArray(int[] arr, int a, int b)")
    @ParameterizedTest(name = "{index}. Передали: массив {1}; интервал: [{2}, {3}]. Ожидаем массив: {0}.")
    @MethodSource
    public void deleteIntervalFromArray(int[] expected, int[] arr, int a, int b) {
        PresentationArrays5 del = new PresentationArrays5();
        Assertions.assertArrayEquals(expected, del.deleteIntervalFromArray(arr, a, b));
    }

    static Stream<Arguments> deleteIntervalFromArray() {
        return Stream.of(
                Arguments.arguments(new int[]{555, -15, 22, 0, 0, 0}, new int[]{15, 0, 555, -15, -5, 22}, -5, 16),
                Arguments.arguments(new int[]{0, 555, -15, -5, 22, 0}, new int[]{15, 0, 555, -15, -5, 22}, 1, 16),
                Arguments.arguments(new int[]{}, new int[]{}, -99, 99),
                Arguments.arguments(new int[]{-15}, new int[]{-15}, 0, 100),
                Arguments.arguments(new int[]{0}, new int[]{5}, 0, 100),
                Arguments.arguments(new int[]{0, 5, 0, 0}, new int[]{1, 1, 0, 5}, 1, 1),
                Arguments.arguments(new int[]{0, 0, 0, 0}, new int[]{1, 2, 3, 4}, 0, 100)
        );
    }
}

package test.home_work_2.presentation.arrays;

import home_work_2.presentation.arrays.PresentationArrays6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PresentationArrays6Test {
    @DisplayName("Тест метода int sumDigitOfArray (int[] array)")
    @ParameterizedTest(name = "{index}. Передали массив: {1}. Ожидаем: {0}.")
    @MethodSource
    public void sumDigitOfArray(int expected, int[] arr) {
        PresentationArrays6 presentationArrays6 = new PresentationArrays6();
        Assertions.assertEquals(expected, presentationArrays6.sumDigitOfArray(arr));
    }

    static Stream<Arguments> sumDigitOfArray() {
        return Stream.of(
                Arguments.arguments(24, new int[]{15, 0, -15, 55, 2}),
                Arguments.arguments(24, new int[]{15, 0, 15, 55, 2}),
                Arguments.arguments(0, new int[]{}),
                Arguments.arguments(1, new int[]{1}),
                Arguments.arguments(16, new int[]{1555}),
                Arguments.arguments(0, new int[]{0, 0, 0, 0})
        );
    }
}

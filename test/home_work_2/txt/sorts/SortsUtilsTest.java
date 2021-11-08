package test.home_work_2.txt.sorts;

import home_work_2.txt.sorts.SortsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class SortsUtilsTest {
    @DisplayName("Тест метода void bubbleSort (int[] array)")
    @ParameterizedTest(name = "{index}. Передали массив: {1}. Ожидаем: \"{0}\".")
    @MethodSource("sortArguments")
    public void bubbleSort (int[] expected, int[] array) {
        Assertions.assertArrayEquals(expected, SortsUtils.bubbleSort(array));
    }

    @DisplayName("Тест метода void shakerSort (int[] array)")
    @ParameterizedTest(name = "{index}. Передали массив: {1}. Ожидаем: \"{0}\".")
    @MethodSource("sortArguments")
    public void shakerSort (int[] expected, int[] array) {
        Assertions.assertArrayEquals(expected, SortsUtils.shakerSort(array));
    }

    static Stream<Arguments> sortArguments(){
        return Stream.of(
                Arguments.arguments(new int[]{1, 2, 3, 4, 5, 6}, new int[] {1, 2, 3, 4, 5, 6}),
                Arguments.arguments(new int[]{1, 1, 1, 1}, new int[] {1, 1, 1, 1}),
                Arguments.arguments(new int[]{1, 5, 9, 9, 9, 99}, new int[] {9, 1, 5, 99, 9, 9}),
                Arguments.arguments(new int[]{}, new int[] {}),
                Arguments.arguments(new int[]{1}, new int[] {1}),
                Arguments.arguments(new int[]{1, 2}, new int[] {1, 2}),
                Arguments.arguments(new int[]{-600, -55, 1, 2, 600, 1000}, new int[] {2, 1, -55, -600, 600, 1000})
        );
    }

}

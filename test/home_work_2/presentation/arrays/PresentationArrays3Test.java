package test.home_work_2.presentation.arrays;

import home_work_2.presentation.arrays.PresentationArrays3;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PresentationArrays3Test {
    @DisplayName("Тест метода String findElementsLessAverage(int[] arr)")
    @ParameterizedTest(name = "{index}. Передали массив: {1}. Ожидаем строку: \"{0}\"")
    @MethodSource
    public void findElementsLessAverage(String expected, int[] arr) {
        PresentationArrays3 presentationArrays3 = new PresentationArrays3();
        assertEquals(expected, presentationArrays3.findElementsLessAverage(arr));
    }

    static Stream<Arguments> findElementsLessAverage() {
        return Stream.of(
                arguments("2", new int[]{15, 22, 2}),
                arguments("", new int[]{15}),
                arguments("", new int[]{15, 15}),
                arguments("15", new int[]{15, 20}),
                arguments("1 5", new int[]{1, 5, 10, 15}),
                arguments("5 1", new int[]{5, 1, 15, 10}),
                arguments("-1 -10", new int[]{5, -1, 15, -10}),
                arguments("0 0 -1", new int[]{0, 0, 2, -1})
        );
    }
}

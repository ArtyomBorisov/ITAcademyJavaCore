package test.home_work_2.presentation.arrays;

import home_work_2.presentation.arrays.PresentationArrays2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PresentationArrays2Test {
    @DisplayName("Тест метода int findMaxNumberOfElementWithEvenIndex(int[] arr)")
    @ParameterizedTest(name = "{index}. Передаем массив: {1}. Ожидаем: {0}.")
    @MethodSource
    public void findMaxNumberOfElementWithEvenIndex(int expected, int[] arr) {
        PresentationArrays2 presentationArrays2 = new PresentationArrays2();
        assertEquals(expected, presentationArrays2.findMaxNumberOfElementWithEvenIndex(arr));
    }

    static Stream<Arguments> findMaxNumberOfElementWithEvenIndex() {
        return Stream.of(
                arguments(126, new int[]{0, -15, 66, 88, 126, -1000}),
                arguments(0, new int[]{}),
                arguments(-51, new int[]{-51}),
                arguments(5, new int[]{5, 5}),
                arguments(5, new int[]{-4, 5, 5, 5})
        );
    }
}

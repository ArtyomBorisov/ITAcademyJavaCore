package test.home_work_2.presentation.arrays;

import home_work_2.presentation.arrays.PresentationArrays4;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PresentationArrays4Test {
    @DisplayName("Тест метода int[] findTwoMinElements(int[] arr), ВАЛИДНЫЕ аргументы")
    @ParameterizedTest(name = "{index}. Передали массив: {1}. Ожидаем массив: {0}.")
    @MethodSource("findTwoMinElementsArguments")
    public void findTwoMinElements(int[] expected, int[] arr) {
        PresentationArrays4 presentationArrays4 = new PresentationArrays4();
        assertArrayEquals(expected, presentationArrays4.findTwoMinElements(arr));
    }

    static Stream<Arguments> findTwoMinElementsArguments() {
        return Stream.of(
                arguments(new int[]{-15, 0}, new int[]{15, 0, -15, 55}),
                arguments(new int[]{0, 15}, new int[]{15, 0}),
                arguments(new int[]{0, 15}, new int[]{0, 15}),
                arguments(new int[]{0, 15}, new int[]{15, 0, 15, 55})
        );
    }

    @DisplayName("Тест метода int[] findTwoMinElements(int[] arr), НЕВАЛИДНЫЕ аргументы")
    @ParameterizedTest(name = "{index}. Передали массив: {0}. Ожидаем ошибку IllegalArgumentException.")
    @MethodSource("findTwoMinElementsIncorrectArguments")
    public void findTwoMinElementsExceptions(int[] arr) {
        PresentationArrays4 presentationArrays4 = new PresentationArrays4();
        assertThrows(IllegalArgumentException.class, () -> {
            presentationArrays4.findTwoMinElements(arr);
        });
    }

    static Stream<Arguments> findTwoMinElementsIncorrectArguments() {
        return Stream.of(
                arguments(new int[]{}),
                arguments(new int[]{15})
        );
    }


}

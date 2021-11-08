package test.home_work_2.txt.arrays.task2_3.api;

import home_work_2.txt.arrays.task2_3.api.IArraysOperation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public interface IArraysOperationTest<T extends IArraysOperation> {
    T iArraysOperation();

    @DisplayName("Тест метода void showElements(int[] container)")
    @MethodSource("showElementsArguments")
    @ParameterizedTest(name = "{index}. Передали массив: {1}. Ожидаем вывод: \"{0}\"")
    default void showElements(String res, int[] arr){
        assertEquals(res, iArraysOperation().showElements(arr));
    }

    static Stream<Arguments> showElementsArguments() {
        return Stream.of(
                arguments("Массив: 1 2 3 4 5 6 ", new int[]{1, 2, 3, 4, 5, 6}),
                arguments("Массив: 5 5 22 -2 654 123 56 -88 ", new int[]{5, 5, 22, -2, 654, 123, 56, -88}),
                arguments("Массив: 0 6 11 -6 -4 -3 ", new int[]{0, 6, 11, -6, -4, -3})
        );
    }

    @DisplayName("Тест метода void showEverySecondElement(int[] container)")
    @MethodSource("showEverySecondElementArguments")
    @ParameterizedTest(name = "{index}. Передали массив: {1}. Ожидаем вывод: \"{0}\"")
    default void showEverySecondElement(String res, int[] arr){
        assertEquals(res, iArraysOperation().showEverySecondElement(arr));
    }

    static Stream<Arguments> showEverySecondElementArguments() {
        return Stream.of(
                arguments("Каждый второй элемент массива: 5 -22 2563 ", new int[]{0, 5, 2, -22, -42, 2563, 14}),
                arguments("Каждый второй элемент массива: 0 0 ", new int[]{0, 0, 0, 0}),
                arguments("Каждый второй элемент массива: ", new int[]{}),
                arguments("Каждый второй элемент массива: ", new int[]{1}),
                arguments("Каждый второй элемент массива: 5 ", new int[]{1, 5})
        );
    }

    @DisplayName("Тест метода void inverseArray(int[] container)")
    @MethodSource("inverseArrayArguments")
    @ParameterizedTest(name = "{index}. Передали массив: {1}. Ожидаем вывод: \"{0}\"")
    default void inverseArray(String res, int[] arr){
        assertEquals(res, iArraysOperation().inverseArray(arr));
    }

    static Stream<Arguments> inverseArrayArguments() {
        return Stream.of(
                arguments("Массив в обратном порядке: 3 2 1 ", new int[]{1, 2, 3}),
                arguments("Массив в обратном порядке: ", new int[]{}),
                arguments("Массив в обратном порядке: 0 ", new int[]{0}),
                arguments("Массив в обратном порядке: 1 0 ", new int[]{0, 1})
        );
    }
}

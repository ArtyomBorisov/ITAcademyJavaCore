package test.home_work_2.txt.loops;

import home_work_2.txt.loops.Loops14;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Loops14Test {
    @DisplayName("Тест метода String overflow(long num)")
    @ParameterizedTest(name = "{index}. Передали число: \"{1}\". Ожидаем: \"{0}\".")
    @MethodSource
    void overflow(String str, long num) {
        Loops14 loops14 = new Loops14();
        assertEquals(str, loops14.overflow(num));
    }

    static Stream<Arguments> overflow() {
        String part1 = "Произошло переполнение. Значение до переполнения: ";
        String part2 = ". Значение после переполнения: ";

        return Stream.of(
                arguments(part1 + 4052555153018976267L + part2 + -6289078614652622815L, 3),
                arguments(part1 + 1560496482665168896L + part2 + -1774566438301073408L, 188),
                arguments(part1 + 799006685782884121L + part2 + 3265617043834753317L, -19),
                arguments(part1 + 7450580596923828125L + part2 + 359414837200037393L, 5),
                arguments(part1 + 1000000000000000000L + part2 + 3875820019684212736L, 1000)
        );
    }
}

package test.home_work_6.search.api;

import home_work_6.search.api.ISearchEngine;
import home_work_6.search.decorators.SearchEngineCaseInsensitive;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public interface ISearchEngineTest<T extends ISearchEngine> {
    T iSearch();

    @DisplayName("Тест метода long search(String text, String word) в зависимости от регистра")
    @ParameterizedTest(name = "{index}. Ищем слово \"{2}\" в тексте \"{1}\". Ожидаем количество: {0}.")
    @MethodSource("searchArguments")
    default void search(int expected, String text, String word){
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        if (iSearch() instanceof SearchEngineCaseInsensitive) {
            return;
        }
        assertEquals(expected, iSearch().search(text, word));
    }

    static Stream<Arguments> searchArguments(){
        return Stream.of(
                arguments(1, "привет, как дела!", "как"),
                arguments(0, "привет,какдела!", "как"),
                arguments(0, "привет;какдела!", "как"),
                arguments(1, "как дела!.Что делаешь?", "Что"),
                arguments(1, "Привет-привет", "привет"),
                arguments(1, "Привет -привет", "привет"),
                arguments(1, "4-х", "4"),
                arguments(1, "один и 1", "один"),
                arguments(1, "бабушка бабушке бабушку", "бабушке"),
                arguments(0, "Она рассматривала картину", "рассматривал"),
                arguments(1, "почему-то она была недовольна", "почему"),
                arguments(1, "почему -то она была недовольна", "почему"),
                arguments(1, "почему- то она была недовольна", "почему"),
                arguments(3, "Пошёл пошёл Пошел пошел шел шёл пошел-пошел", "пошел")
        );
    }

    @DisplayName("Тест метода long search(String text, String word) ВНЕ зависимости от регистра")
    @ParameterizedTest
    @MethodSource("searchCaseInsensitiveArguments")
    default void searchCaseInsensitive(int expected, String text, String word){
        if (iSearch() instanceof SearchEngineCaseInsensitive) {
            assertEquals(expected, iSearch().search(text, word));
        } else {
            assertEquals(expected, new SearchEngineCaseInsensitive(iSearch()).search(text, word));
        }
    }

    static Stream<Arguments> searchCaseInsensitiveArguments(){
        return Stream.of(
                arguments(1, "привет, как дела!", "как"),
                arguments(6, "Привет привеТ привет ПРИвет ПРИВЕТ приВЕТ", "привет"),
                arguments(5, "Он она конь пони оно оН он конечно он-он", "он")
        );
    }


}

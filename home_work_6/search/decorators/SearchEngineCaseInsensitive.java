package home_work_6.search.decorators;

import home_work_6.search.api.ISearchEngine;
import home_work_6.search.simple.RegExSearch;

import java.util.regex.Pattern;

public class SearchEngineCaseInsensitive implements ISearchEngine {

    private ISearchEngine search;

    public SearchEngineCaseInsensitive(ISearchEngine search) {
        this.search = search;
    }

    /**
     * метод реализует поиск слова в тексте и возвращает количество раз, которое встречается слово в тексте
     * (вне зависимости от регистра)
     * @param text текст для проверки на содержание слова
     * @param word слово для проверки на содержание в тексте
     * @return количество раз, которое встречается слово в тексте
     */
    @Override
    public long search(String text, String word) {
        String lowerText = text.toLowerCase();
        String lowerWord = word.toLowerCase();
        return search.search(lowerText, lowerWord);
    }
}

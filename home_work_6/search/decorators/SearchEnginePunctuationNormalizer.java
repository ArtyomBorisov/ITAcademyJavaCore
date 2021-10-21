package home_work_6.search.decorators;

import home_work_6.search.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private ISearchEngine search;

    public SearchEnginePunctuationNormalizer (ISearchEngine search) {
        this.search = search;
    }

    /**
     * метод реализует поиск слова в тексте и возвращает количество раз, которое встречается слово в тексте
     * @param text текст для проверки на содержание слова
     * @param word слово для проверки на содержание в тексте
     * @return количество раз, которое встречается слово в тексте
     */
    @Override
    public long search(String text, String word) {
        String cleanedText = text.replaceAll("^A-яёЁ\\w+", " ");
        return search.search(cleanedText, word);
    }
}

package home_work_6.search.decorators;

import home_work_6.search.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private ISearchEngine search;

    public SearchEnginePunctuationNormalizer (ISearchEngine search) {
        this.search = search;
    }

    @Override
    public long search(String text, String word) {
        String cleanedText = text.replaceAll("^A-яёЁ\\w+", " ");
        return search.search(cleanedText, word);
    }
}

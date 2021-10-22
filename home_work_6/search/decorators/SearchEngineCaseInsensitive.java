package home_work_6.search.decorators;

import home_work_6.search.api.ISearchEngine;

public class SearchEngineCaseInsensitive implements ISearchEngine {

    private ISearchEngine search;

    public SearchEngineCaseInsensitive(ISearchEngine search) {
        this.search = search;
    }

    @Override
    public long search(String text, String word) {
        String lowerText = text.toLowerCase();
        String lowerWord = word.toLowerCase();
        return search.search(lowerText, lowerWord);
    }
}

package test.home_work_6.search.decorators;

import home_work_6.search.api.ISearchEngine;
import home_work_6.search.decorators.SearchEnginePunctuationNormalizer;
import home_work_6.search.simple.EasySearch;
import test.home_work_6.search.api.ISearchEngineTest;

public class SearchEnginePunctuationNormalizerTest implements ISearchEngineTest {
    @Override
    public ISearchEngine iSearch() {
        return new SearchEnginePunctuationNormalizer(new EasySearch());
    }
}

package test.home_work_6.search.decorators;

import home_work_6.search.api.ISearchEngine;
import home_work_6.search.decorators.SearchEngineCaseInsensitive;
import home_work_6.search.simple.EasySearch;
import test.home_work_6.search.api.ISearchEngineTest;

public class SearchEngineCaseInsensitiveTest implements ISearchEngineTest {
    @Override
    public ISearchEngine iSearch() {
        return new SearchEngineCaseInsensitive(new EasySearch());
    }
}

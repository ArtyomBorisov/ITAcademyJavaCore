package test.home_work_6.search.simple;

import home_work_6.search.api.ISearchEngine;
import home_work_6.search.simple.RegExSearch;
import test.home_work_6.search.api.ISearchEngineTest;

public class RegExSearchTest implements ISearchEngineTest {
    @Override
    public ISearchEngine iSearch() {
        return new RegExSearch();
    }
}

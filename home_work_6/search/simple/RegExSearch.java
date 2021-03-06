package home_work_6.search.simple;

import home_work_6.search.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        long res = 0;

        Pattern p = Pattern.compile("\\b" + word + "\\b");
        Matcher m = p.matcher(text);

        while (m.find()) {
            res++;
        }

        return res;
    }
}

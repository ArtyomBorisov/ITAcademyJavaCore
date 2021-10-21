package home_work_6.search.simple;

import home_work_6.search.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    /**
     * метод реализует поиск слова в тексте и возвращает количество раз, которое встречается слово в тексте
     * @param text текст для проверки на содержание слова
     * @param word слово для проверки на содержание в тексте
     * @return количество раз, которое встречается слово в тексте
     */
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

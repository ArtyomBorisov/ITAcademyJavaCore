package home_work_6.runners;

import home_work_6.readerTxt.ReaderTxt;
import home_work_6.search.api.ISearchEngine;
import home_work_6.search.decorators.SearchEngineCaseInsensitive;
import home_work_6.search.decorators.SearchEnginePunctuationNormalizer;
import home_work_6.search.simple.EasySearch;
import home_work_6.search.simple.RegExSearch;

public class Main3 {
    public static void main(String[] args) {
        ReaderTxt readerTxt = new ReaderTxt();
        String text;

        text = readerTxt.readTxt("Война и мир_книга.txt");

        String[] words = {"война", "и", "мир"};
        // война - 52; и - 14601; мир - 33

        ISearchEngine search1 = new EasySearch();
        ISearchEngine search2 = new RegExSearch();
        ISearchEngine search3 = new SearchEnginePunctuationNormalizer(new EasySearch());
        ISearchEngine search4 = new SearchEngineCaseInsensitive(new RegExSearch());

        print(words, search1, text);
        print(words, search2, text);
        print(words, search3, text);
        print(words, search4, text);
    }

    /**
     * метод для печати количества повторений слов в тексте
     * @param words массив слов для проверки на повторения
     * @param search объект для поиска слов в тексте
     * @param text текст
     */
    public static void print(String[] words, ISearchEngine search, String text) {
        System.out.println(search.getClass().getSimpleName());

        if (search instanceof SearchEngineCaseInsensitive) {
            for (String word : words) {
                printWord(word, search, text);
            }
            System.out.println();
            return;
        }

        for (String word : words) {
            printWord(word.toLowerCase(), search, text.toLowerCase());
        }
        System.out.println();
    }

    /**
     * метод для печати количества повторений слова в тексте
     * @param word слово
     * @param search объект для поиска слова в тексте
     * @param text текст
     */
    public static void printWord(String word, ISearchEngine search, String text) {
        System.out.println("Количество повторений слова \"" + word + "\" - " + search.search(text, word));
    }
}

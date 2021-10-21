package home_work_6.search.simple;

import home_work_6.search.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    /**
     * метод реализует поиск слова в тексте и возвращает количество раз, которое встречается слово в тексте
     * @param text текст для проверки на содержание слова
     * @param word слово для проверки на содержание в тексте
     * @return количество раз, которое встречается слово в тексте
     */
    @Override
    public long search(String text, String word) {
        long res = 0;
        int index = 0;

        while (true) {
            index = text.indexOf(word, index);

            if (isWordPartOfOtherWord(index, text, word)) {
                index += word.length();
                continue;
            }

            if (index == -1) {
                break;
            }

            index += word.length();
            res++;
        }
        return res;
    }

    /**
     * метод для проверки, является ли найденное слово отдельностоящим или фрагментом другого слова
     * @param index индекс начала найденного слова или фрагмента слова
     * @param text текст, в котором происходит поиск
     * @param word слово для поиска
     * @return
     */
    private boolean isWordPartOfOtherWord(int index, String text, String word) {
        try {
            if (isCharLetter(text.charAt(index - 1)) || isCharLetter(text.charAt(index + word.length()))) {
                return true;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return false;
        }
        return false;
    }

    /**
     * метод для проверки, является ли символ буквой английского или русского алфавита
     * @param ch символ
     * @return true, если символ является буквой английского или русского алфавита
     *         false, если не является
     */
    private boolean isCharLetter(char ch) {
        return (ch >= 'A' && ch <= 'z') || (ch >= 'А' && ch <= 'я') || (ch == 'Ё') || (ch == 'ё');
    }
}

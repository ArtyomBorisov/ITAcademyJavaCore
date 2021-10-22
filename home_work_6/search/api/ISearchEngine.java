package home_work_6.search.api;

public interface ISearchEngine {
    /**
     * метод реализует поиск слова в тексте и возвращает количество раз, которое встречается слово в тексте
     * @param text текст для проверки на содержание слова
     * @param word слово для проверки на содержание в тексте
     * @return количество раз, которое встречается слово в тексте
     */
    long search(String text, String word);
}

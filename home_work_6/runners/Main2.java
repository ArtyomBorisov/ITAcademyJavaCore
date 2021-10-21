package home_work_6.runners;

import home_work_6.comparators.ComparatorMapValue;
import home_work_6.readerTxt.ReaderTxt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        ReaderTxt readerTxt = new ReaderTxt();
        String book;

        book = readerTxt.readTxt("Война и мир_книга.txt");

        Map<String, Integer> map = new HashMap();

        String[] words = book.split("[^A-яёЁ\\w]+");

        for (String word : words) {

            if (map.containsKey(word)) {
                int count = map.get(word);
                count++;
                map.put(word, count);
                continue;
            }

            map.put(word, 1);
        }

        List<Map.Entry> list = new ArrayList(map.entrySet());
        list.sort(new ComparatorMapValue().reversed());

        printTop(list, 10);
    }

    /**
     * метод для печати первых элементов типа Map.Entry из списка
     * @param list список
     * @param num количество элементов для печати
     */
    public static void printTop (List<Map.Entry> list, int num) {
        for (int i = 0; i < num; i++) {
            System.out.printf("Слово \"%s\"  использовалось %s раз.%n", list.get(i).getKey(), list.get(i).getValue());
        }
    }
}

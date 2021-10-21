package home_work_6.runners;

import home_work_6.readerTxt.ReaderTxt;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        ReaderTxt readerTxt = new ReaderTxt();
        String book;

        book = readerTxt.readTxt("Война и мир_книга.txt");

        Set<String> set = new HashSet();

        String[] words = book.split("[^A-яёЁ\\w]+");

        Collections.addAll(set, words);

        System.out.println("Количество уникальных использованных слов в тексте: " + set.size() + ".");
    }
}

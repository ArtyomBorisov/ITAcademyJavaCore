package home_work_6.task7;

import home_work_6.readerTxt.ReaderTxt;
import home_work_6.search.api.ISearchEngine;
import home_work_6.search.decorators.SearchEngineCaseInsensitive;
import home_work_6.search.simple.RegExSearch;
import home_work_6.task7.workWithFiles.ReaderFiles;
import home_work_6.task7.workWithFiles.WriterResult;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Task7Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ReaderTxt readerTxt = new ReaderTxt();
        ISearchEngine search = new RegExSearch();
        ISearchEngine searchCaseInsensitive = new SearchEngineCaseInsensitive(search);
        ReaderFiles readerFiles = new ReaderFiles();
        WriterResult writerResult = new WriterResult();

        System.out.println("Введите адрес папки:");
        String directoryPath = scan.nextLine();
        File directory = null;

        while (directory == null) {
            try {
                directory = readerFiles.validationDirectory(directoryPath);
            } catch (IllegalArgumentException e) {
                System.out.println("Проблема с адресом папки:\n" + e + "\nВведите ещё раз:");
                directoryPath = scan.nextLine();
            }
        }

        List<String> absoluteDirectoryFiles = readerFiles.createListAbsoluteDirectoryFiles(directory);

        int exit;
        long result;
        do {
            System.out.println("В каком тексте будем искать слово? Введите цифру.");
            System.out.println(readerFiles.printList(absoluteDirectoryFiles));

            int num = scan.nextInt();

            while (!readerFiles.validationNumberOfElementAtList(num, absoluteDirectoryFiles)) {
                System.out.println("Текста с таким номером нет. Введите ещё раз: ");
                num = scan.nextInt();
            }

            String fileForRead = absoluteDirectoryFiles.get(num);

            String text = readerTxt.readTxt(fileForRead);

            System.out.println("Какое слово ищем?");

            scan.nextLine();
            String word = scan.nextLine();

            System.out.println("Ищем с учётом регистра? true или false");
            boolean bool = scan.nextBoolean();

            if (bool) {
                result = search.search(text, word);
            } else {
                result = searchCaseInsensitive.search(text, word);
            }

            try {
                writerResult.writeResult(fileForRead, word, result);
            } catch (IOException e) {
                System.out.println("Ошибка записи в файл" + e);
            }


            System.out.println("Введите: 0 - если хотите выйти, любую другую цифру - если продолжить поиски...");
            exit = scan.nextInt();
        } while (exit != 0);
    }
}

package home_work_6.task8;

import home_work_6.readerTxt.ReaderTxt;
import home_work_6.search.api.ISearchEngine;
import home_work_6.search.simple.RegExSearch;
import home_work_6.task7.workWithFiles.ReaderFiles;
import home_work_6.task7.workWithFiles.WriterResult;
import home_work_6.task8.search.SearchWithLockAndLatchAndWriteResultInTxt;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task8Main {
    public static void main(String[] args) throws InterruptedException {
        ReaderFiles readerFiles = new ReaderFiles();
        ReaderTxt readerTxt = new ReaderTxt();
        Scanner scan = new Scanner(System.in);
        ISearchEngine search = new RegExSearch();
        WriterResult writerResult = new WriterResult();
        File directory = null;
        String word;

        System.out.println("Введите каталог с файлами:");
        String directoryPath = scan.nextLine();

        do {
            try {
                directory = readerFiles.validationDirectory(directoryPath);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка с каталогом: " + e);
                System.out.println("Введите ещё раз:");
                directoryPath = scan.nextLine();
            }
        } while (directory == null);

        List<String> listAbsoluteDirectoryFiles = readerFiles.createListAbsoluteDirectoryFiles(directory);

        Object lock = new Object();

        CountDownLatch latch = new CountDownLatch(listAbsoluteDirectoryFiles.size());

        ExecutorService executorService = Executors.newFixedThreadPool(20);

        String exit;

        do {
            System.out.println("Какое слово ищем?");
            word = scan.nextLine();

            for (String file : listAbsoluteDirectoryFiles) {
                executorService.submit(new SearchWithLockAndLatchAndWriteResultInTxt(search, readerTxt.readTxt(file),
                        word, writerResult, lock, latch, file));
            }

            latch.await();

            System.out.println("Введите \"0\", если желаете выйти, что угодно, если желаете продолжить.");
            exit = scan.nextLine();
        } while (exit.length() != 1 || exit.charAt(0) != '0');

        executorService.shutdown();
    }
}

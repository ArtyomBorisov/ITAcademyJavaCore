package home_work_6.task8.search;

import home_work_6.search.api.ISearchEngine;
import home_work_6.task7.workWithFiles.WriterResult;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class SearchWithLockAndLatchAndWriteResultInTxt implements Runnable{
    private final ISearchEngine engine;
    private final String text;
    private final String word;
    private final WriterResult writerResult;
    private final Object lock;
    private final CountDownLatch latch;
    private final String nameFile;

    public SearchWithLockAndLatchAndWriteResultInTxt(ISearchEngine engine, String text, String word,
                                                     WriterResult writerResult, Object lock,
                                                     CountDownLatch latch, String nameFile) {
        this.engine = engine;
        this.text = text;
        this.word = word;
        this.writerResult = writerResult;
        this.lock = lock;
        this.latch = latch;
        this.nameFile = nameFile;
    }

    @Override
    public void run() {
        long result = engine.search(text, word);
        synchronized (lock){
            try {
                writerResult.writeResult(nameFile, word, result);
            } catch (IOException e) {
                throw new RuntimeException("Ошибка записи в файл:\n" + e);
            }
        }
        latch.countDown();
    }
}

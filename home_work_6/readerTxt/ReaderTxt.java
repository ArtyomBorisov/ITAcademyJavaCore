package home_work_6.readerTxt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReaderTxt {
    /**
     * метод для преобразования файлового документа txt в строку String
     * @param filePath путь к файлу txt
     * @return строку
     */
    public String readTxt(String filePath) {
        String text = "";
        try {
            text = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            throw new RuntimeException("Произошла ошибка чтения файла!", e);
        }
        return text;
    }
}

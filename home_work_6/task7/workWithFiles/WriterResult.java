package home_work_6.task7.workWithFiles;

import java.io.FileWriter;
import java.io.IOException;

public class WriterResult {
    /**
     * метод для печати результатов поиска слова в файл result.txt
     * @param nameFile название файла, в котором производился поиск
     * @param word слово для поиска
     * @param result результат поиска
     * @throws IOException если не удалось записать результат в файл
     */
    public void writeResult(String nameFile, String word, long result) throws IOException {
        StringBuilder sb = new StringBuilder();

        try (FileWriter writer = new FileWriter("result.txt", true)) {
            writer.write(sb.append(nameFile)
                    .append(" - ")
                    .append(word)
                    .append(" - ")
                    .append(result)
                    .append("\r\n").toString());
        } catch (IOException e) {
            throw new RuntimeException("Произошла ошибка записи");
        }

    }
}

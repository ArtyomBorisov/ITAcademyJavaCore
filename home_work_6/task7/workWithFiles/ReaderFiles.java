package home_work_6.task7.workWithFiles;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReaderFiles {
    /**
     * метод проверяет переданный адрес, является ли он каталогом и есть ли доступ к нему
     * @param directoryPath адрес
     * @return каталог типа File
     * @throws IllegalArgumentException если передан некорректный адрес каталога или нет доступа к чтению каталога
     */
    public File validationDirectory(String directoryPath) throws IllegalArgumentException{
        File directory = new File(directoryPath);
        if (!directory.isDirectory()) {
            throw new IllegalArgumentException("Передан некорретный адрес папки.");
        } else if (!directory.canRead()) {
            throw new IllegalArgumentException("Нет доступа к чтению папки.");
        }
        return directory;
    }

    /**
     * метод для создания списка файлов типа .txt из переданного каталога
     * @param directory каталог
     * @return список файлов типа .txt
     */
    public List<String> createListAbsoluteDirectoryFiles(File directory){
        if (directory == null || !directory.isDirectory()) {
            throw new IllegalArgumentException("Передан некорректный каталог.");
        }

        File[] files = directory.listFiles(file -> file.getName().endsWith(".txt"));

        List<String> absoluteDirectoryFiles = new ArrayList<>();
        for (File file : files) {
            absoluteDirectoryFiles.add(file.getAbsolutePath());
        }

        return absoluteDirectoryFiles;
    }

    /**
     * метод для создания строки списка объектов типа String с их порядковыми номерами
     * @param list список
     * @return строку
     */
    public String printList(List<String> list){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(i)
                    .append(". ")
                    .append(list.get(i))
                    .append("\r\n");
        }
        return sb.toString();
    }

    /**
     * метод для проверки "существования" элемента с порядковым номером в списке
     * @param num порядковый номер
     * @param list список
     * @return true, такой элемент существует
     *         false, если такого элемента нет
     */
    public boolean validationNumberOfElementAtList(int num, List<String> list){
        return num >= 0 && num < list.size();
    }
}

package home_work_5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomStudent {
    private List<String> listFromTxt = new ArrayList<>();
    private ThreadLocalRandom rnd = ThreadLocalRandom.current();

    /**
     * метод для генерирования студента со случайными полями
     * @param a число, обозначающее выбор способа генерации имени студента:
     *          1 - случайные русские символы
     *          2 - случайные понятные имена из массива
     *          3 - случайные понятные имена из txt файла
     * @return сгенерированного студента
     */
    public Student createRandomStudent(int a) {
        Student stud = new Student();
        stud.setAge(rnd.nextInt(7, 18));
        stud.setMark(rnd.nextInt(0, 101) / 10.0);
        stud.setOlympiad(rnd.nextBoolean());

        switch (a) {
            case 1: stud.setName(randomName1());
                    break;
            case 2: stud.setName(randomName2());
                    break;
            case 3: stud.setName(randomName3());
                    break;
        }

        return stud;
    }

    /**
     * метод для генерирования имени из рандомных русских символов (длиной от 3 до 7)
     * @return строку (имя) длиной от 3 до 7
     */
    public String randomName1() {
        StringBuilder sb = new StringBuilder();

        int lengthName = rnd.nextInt(3, 8);

        for (int i = 0; i < lengthName; i++) {
            char ch = (char) rnd.nextInt('А', 'я');
            sb.append(ch);
        }

        return sb.toString();
    }

    /**
     * метод для наполнения списка имён студентов из текстового файла rusName.txt
     */
    private void fillListOfName() {
        try {
            Reader input = new FileReader("rusName.txt");
            StringBuilder sb = new StringBuilder();

            while (true) {
                int read = input.read();

                if (read == -1) {
                    break;
                }

                if (read == 13) { //13 соответствует переводу строки
                    listFromTxt.add(sb.toString());
                    sb = new StringBuilder();
                    continue;
                }

                if (read == 10) {
                    continue;
                }

                sb.append((char) read);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * метод для генерирования рандомного имени из текстового файла rusName.txt
     * @return строку (имя)
     */
    public String randomName3() {
        if (listFromTxt.isEmpty()) {
            fillListOfName();
        }
        return listFromTxt.get(rnd.nextInt(0, listFromTxt.size()));
    }

    /**
     * метод для генерирования рандомного имени из массива имён
     * @return строку (имя)
     */
    public String randomName2() {
        String[] names = {"Александр",
                "Александра",
                "Алексей",
                "Алена",
                "Алёна",
                "Алина",
                "Алла",
                "Анастасия",
                "Анатолий",
                "Андрей",
                "Анна",
                "Антон",
                "Антонина",
                "Артем",
                "Артём",
                "Артур",
                "Борис",
                "Вадим",
                "Валентин",
                "Валентина",
                "Валерий",
                "Валерия",
                "Василий",
                "Вера",
                "Вероника",
                "Виктор",
                "Виктория",
                "Виталий",
                "Владимир",
                "Владислав",
                "Вячеслав",
                "Галина",
                "Геннадий",
                "Георгий",
                "Григорий",
                "Даниил",
                "Дарья",
                "Денис",
                "Диана",
                "Дмитрий",
                "Евгений",
                "Евгения",
                "Евдокия",
                "Егор",
                "Екатерина",
                "Елена",
                "Елизавета",
                "Зинаида",
                "Зоя",
                "Иван",
                "Игорь",
                "Илья",
                "Инна",
                "Ирина",
                "Кирилл",
                "Клавдия",
                "Константин",
                "Кристина",
                "Ксения",
                "Лариса",
                "Леонид",
                "Лидия",
                "Лилия",
                "Любовь",
                "Людмила",
                "Максим",
                "Маргарита",
                "Марина",
                "Мария",
                "Михаил",
                "Надежда",
                "Наталия",
                "Наталья",
                "Никита",
                "Николай",
                "Нина",
                "Оксана",
                "Олег",
                "Олеся",
                "Ольга",
                "Павел",
                "Петр",
                "Пётр",
                "Полина",
                "Раиса",
                "Роман",
                "Руслан",
                "Светлана",
                "Сергей",
                "Софья",
                "Станислав",
                "Степан",
                "Тамара",
                "Татьяна",
                "Федор",
                "Эдуард",
                "Юлия",
                "Юрий",
                "Яна",
                "Ярослав"};
        return names[rnd.nextInt(0, names.length)];
    }
}

package home_work_5;

import java.util.concurrent.ThreadLocalRandom;

public class RandomStudent {
    /**
     * метод для генерирования студента со случайными полями
     * @return сгенерированного студента
     */
    public Student createRandomStudent() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        Student stud = new Student();
        stud.setAge(rnd.nextInt(7, 18));
        stud.setMark(rnd.nextInt(0, 101) / 10.0);
        stud.setOlympiad(rnd.nextBoolean());
        stud.setName(randomName1());
//        stud.setName(randomName2());
        return stud;
    }

    /**
     * метод для генерирования имени из рандомных русских символов (длиной от 3 до 7)
     * @return строку (имя) длиной от 3 до 7
     */
    public String randomName1() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        StringBuilder sb = new StringBuilder();

        int lengthName = rnd.nextInt(3, 8);

        for (int i = 0; i < lengthName; i++) {
            char ch = (char) rnd.nextInt('А', 'я');
            sb.append(ch);
        }

        return sb.toString();
    }

    /**
     * метод для генерирования рандомного имени из массива имён
     * @return строку (имя)
     */
    public String randomName2() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
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

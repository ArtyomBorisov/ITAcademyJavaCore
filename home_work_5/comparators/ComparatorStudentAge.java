package home_work_5.comparators;

import home_work_5.dto.Student;

import java.util.Comparator;

public class ComparatorStudentAge implements Comparator<Student> {
    /**
     * Компаратор сравнивает два объекта Student по возрасту (поле age)
     * @param o1 первый объект
     * @param o2 второй объект
     * @return отрицательное число, если o1 меньше о2
     *         ноль, если o1 равен о2
     *         положительное число, если о1 больше о2
     */
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}
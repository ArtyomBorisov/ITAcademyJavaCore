package home_work_5.comparators;

import home_work_5.dto.Student;

import java.util.Comparator;

public class ComparatorStudentMark implements Comparator<Student> {
    /**
     * Компаратор сравнивает два объекта Student по оценке (поле mark)
     * @param o1 первый объект
     * @param o2 второй объект
     * @return отрицательное число, если o1 меньше о2
     *         ноль, если o1 равен о2
     *         положительное число, если о1 больше о2
     */
    @Override
    public int compare(Student o1, Student o2) {
        return (int) Math.signum(o1.getMark() - o2.getMark());
    }
}
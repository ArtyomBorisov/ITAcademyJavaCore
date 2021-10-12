package home_work_5.comparators;

import home_work_5.Student;

import java.util.Comparator;

public class ComparatorStudentMark implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (int) Math.signum(o2.getMark() - o1.getMark());
    }
}
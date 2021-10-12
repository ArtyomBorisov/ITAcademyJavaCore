package home_work_5.comparators;

import home_work_5.Student;

import java.util.Comparator;

public class ComparatorStudentAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}
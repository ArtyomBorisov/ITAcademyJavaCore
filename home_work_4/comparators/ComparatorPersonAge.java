package home_work_4.comparators;

import home_work_4.Person;

import java.util.Comparator;

public class ComparatorPersonAge implements Comparator<Person> {
    @Override
    public int compare (Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
    }
}



package home_work_4.comparators;

import home_work_4.Person;

import java.util.Comparator;

public class ComparatorPersonName implements Comparator<Person> {
    @Override
    public int compare (Person p1, Person p2) {
        if (p1.getName() == null) {
            return 1;
        } else if (p2.getName() == null) {
            return -1;
        }
        return p1.getName().compareTo(p2.getName());
    }
}



package home_work_4.main;

import home_work_4.DataContainer;
import home_work_4.Person;
import home_work_4.comparators.ComparatorPersonAge;
import home_work_4.comparators.ComparatorPersonName;

public class ComparatorPersonMain {
    public static void main(String[] args) {
        Person[] persons = new Person[6];

        persons[0] = new Person("Мария", 44);
        persons[1] = new Person("Катя", 2);
        persons[2] = new Person("Полина", 32);
        persons[3] = new Person("Андрей", 15);
        persons[4] = new Person("Николай", 64);
        persons[5] = new Person("Юлия", 25);
        print(persons);

        DataContainer<Person> personDataContainer = new DataContainer<>(persons);

        personDataContainer.sort(new ComparatorPersonName());
        print(persons);

        personDataContainer.sort(new ComparatorPersonAge());
        print(persons);
    }

    public static void print (Person[] persons) {
        for (Person person: persons) {
            System.out.print(person.getName() + " ");
            System.out.println(person.getAge() + " ");
        }
        System.out.println("____________________");
    }
}

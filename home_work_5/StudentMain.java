package home_work_5;

import home_work_5.comparators.ComparatorStudentAge;
import home_work_5.comparators.ComparatorStudentMark;
import home_work_5.comparators.ComparatorStudentName;
import home_work_5.dto.Student;

import java.util.*;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        RandomStudent randomStudent = new RandomStudent();
        Scanner scan = new Scanner(System.in);

        System.out.println("Как генерируем имена?\n1) рандомные русские символы; " +
                "\n2) понятные рандомные имена;\n3) понятные рандомные имена из txt файла");
        int a;

        while (true) {
            try {
                a = scan.nextInt();
                if (a == 1 || a == 2 || a == 3) {
                    break;
                } else {
                    System.out.println("1, 2 или 3:");
                    a = scan.nextInt();
                }
            } catch (InputMismatchException e) {
                System.out.println("1, 2 или 3:");
                scan.nextLine();
            }
        }

        for (int i = 0; i < 10_000; i++) {
            Student stud = randomStudent.createRandomStudent(a);
            stud.setNum(i + 1);
            students.add(stud);
        }

        List<Student> studentsNew = new ArrayList<>();
        for (Student st: students) {
            if (st.getAge() > 11 && st.getMark() > 8) {
                studentsNew.add(st);
            }
        }

        Collections.sort(studentsNew, new ComparatorStudentName());
        System.out.println("Топ 10 студентов по имени");
        printListStudentsNotAll(studentsNew, 10);

        Collections.sort(studentsNew, new ComparatorStudentAge());
        System.out.println("Топ 10 студентов по возрасту");
        printListStudentsNotAll(studentsNew, 10);

        List<Student> tempList = new ArrayList<>();

        SortedSet<Integer> setOfAge = new TreeSet<>();
        for (Student st: studentsNew) {
            setOfAge.add(st.getAge());
        }

        for (Integer age: setOfAge) {
            for (Student st: studentsNew) {
                if (age == st.getAge()) {
                    tempList.add(st);
                }
            }

            Collections.sort(tempList, new ComparatorStudentMark().reversed());

            System.out.println("Топ 10 студентов по оценке (возраст " + age + ")");
            printListStudentsNotAll(tempList, 10);
            tempList.clear();
        }
    }

    /**
     * метод для печати первых n студентов из переданного списка
     * @param st переданный список студентов
     * @param number количество студентов для печати
     */
    public static void printListStudentsNotAll(List<Student> st, int number) {
        for (int i = 0; i < number; i++) {
            System.out.printf("%s. Студент: %s; возраст %s; оценка %s; участие в олимпиаде: %s%n",
                    st.get(i).getNum(), st.get(i).getName(), st.get(i).getAge(), st.get(i).getMark(), st.get(i).isOlympiad());
        }
        System.out.println("_____________________");
    }

    /**
     * метод для печати всего списка студентов
     * @param st переданный список студентов
     */
    public static void printListStudents(List<Student> st) {
        st.forEach(stud -> System.out.printf("%s. Студент: %s; возраст %s; оценка %s; участие в олимпиаде: %s%n",
                stud.getNum(), stud.getName(), stud.getAge(), stud.getMark(), stud.isOlympiad()));
    }

}

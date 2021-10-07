package home_work_4.main;

import home_work_4.DataContainer;
import home_work_4.comparators.*;

public class ComparatorDoubleIntegerStringMain {
    public static void main(String[] args) {
        Integer[] data1 = {null, 1, 0, 2, 3, 777, 3, 5};
        Double[] data2 = {1.6, 0.5, -15d, 2.2, 3.3, null, 77.7, 3d, (double) 5};
        String[] data3 = {"Вася", "Дима", "Вика", "Андрей", "Роберт", "Ян", null, "Михаил", "Костя", "Даниил", "Павел"};

        DataContainer<Integer> container1 = new DataContainer<>(data1);
        DataContainer<Double> container2 = new DataContainer<>(data2);
        DataContainer<String> container3 = new DataContainer<>(data3);

        System.out.println("___________________Integer_____________________");
        System.out.println(container1.toString());
        container1.sort(new ComparatorInteger());
        System.out.println(container1.toString());

        System.out.println("___________________Double_____________________");
        System.out.println(container2.toString());
        container2.sort(new ComparatorDouble());
        System.out.println(container2.toString());

        System.out.println("___________________String_____________________");
        System.out.println(container3.toString());
        container3.sort(new ComparatorString());
        System.out.println(container3.toString());

    }

}

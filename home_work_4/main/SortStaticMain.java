package home_work_4.main;

import home_work_4.DataContainer;
import home_work_4.comparators.ComparatorInteger;

public class SortStaticMain {
    public static void main(String[] args) {
        Integer[] data = {88, -1, 0, 2, 3, 777, 3, 5};
        DataContainer<Integer> cont = new DataContainer<>(data);
        System.out.println(cont.toString());
        cont.sort(cont);
        System.out.println(cont.toString());
    }
}
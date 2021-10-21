package home_work_6.comparators;

import java.util.Map;

public class ComparatorMapValue implements java.util.Comparator<Map.Entry> {
    /**
     * компаратор для сравнения двух объектов Map.Entry по значению (value)
     * @param o1 первый объект
     * @param o2 второй объект
     * @return отрицательное число, если o1 меньше о2
     *         ноль, если о1 равен о2
     *         положительное число, если о1 больше о2
     */
    @Override
    public int compare(Map.Entry o1, Map.Entry o2) {
        return (int) o1.getValue() - (int) o2.getValue();
    }
}

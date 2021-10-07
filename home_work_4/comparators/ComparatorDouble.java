package home_work_4.comparators;

import java.util.Comparator;

public class ComparatorDouble implements Comparator<Double> {
    @Override
    public int compare (Double o1, Double o2) {
        if (o1 == null) {
            return 1;
        } else if (o2 == null) {
            return -1;
        }
        return o1.compareTo(o2);
    }
}



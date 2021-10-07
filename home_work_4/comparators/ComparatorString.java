package home_work_4.comparators;

import java.util.Comparator;

public class ComparatorString implements Comparator<String> {
    @Override
    public int compare (String o1, String o2) {
        if (o1 == null) {
            return 1;
        } else if (o2 == null) {
            return -1;
        }
        return o1.compareTo(o2);
    }
}



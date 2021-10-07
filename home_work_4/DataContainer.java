package home_work_4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] item) {
        this.data = item;
    }

    public int add(T item) {
        if (item == null) { return -1; }

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }

        data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = item;
        return data.length - 1;
    }

    public T get(int index) {
        if (index >= data.length || index < 0) { return null; }
        return data[index];
    }

    public T[] getItems() { return data; }

    public boolean delete(int index) {
        if (index >= data.length || index < 0) { return false; }

        for (int i = index; i < data.length - 1; i++) {
            data[i] = data[i+1];
        }

        data = Arrays.copyOf(data, data.length - 1);
        return true;
    }

    public boolean delete(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null && data[i].equals(item)) {
                return delete(i);
            }
        }
        return false;
    }

    public void sort (Comparator<T> comparator) {
        boolean isSorted;
            do {
                isSorted = true;
                for (int i = 1; i < data.length; i++) {
                    if (comparator.compare(data[i], data[i - 1]) < 0) {
                        T temp = data[i - 1];
                        data[i - 1] = data[i];
                        data[i] = temp;
                        isSorted = false;
                    }
                }
            } while (!isSorted) ;
    }

    public static void sort (DataContainer container, Comparator comparator) {
        container.sort(comparator);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String prefix = "";
        for (T arr: data) {
            if (arr != null) {
                stringBuilder.append(prefix);
                prefix = ", ";
                stringBuilder.append(arr);
            }
        }
        return stringBuilder.toString();
    }
}
package home_work_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] item) {
        this.data = Arrays.copyOf(item, item.length);
    }

    /**
     * Метод добавляет данные в хранилище,
     * переданный элемент сохраняется в первую свободную ячейку (null);
     * если хранилище заполнено, оно расширяется на одну ячейку; запрещено вставлять null
     * @param item элемент для сохранения
     * @return -1 - если передали null;
     *         0 и больше - если элемент был вставлен, число означает индекс вставленного элемента
     */
    public int add(T item) {
        if (item == null) { return -1; }

        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = item;
                return i;
            }
        }

        this.data = Arrays.copyOf(this.data, this.data.length + 1);
        this.data[this.data.length - 1] = item;
        return this.data.length - 1;
    }

    /**
     * Метод возвращает элемент, хранимый в контейнере
     * @param index индекс элемента
     * @return null, если элемента с таким индексом нет в хранилище
     */
    public T get(int index) {
        if (isIndexOutOfBound(index)) { return null; }
        return this.data[index];
    }

    /**
     * Метод возвращает содержимое контейнера
     * @return копия контейнера
     */
    public T[] getItems() { return Arrays.copyOf(this.data, this.data.length); }

    /**
     * Метод удаляет элемент из хранилища по индексу
     * @param index индекс элемента
     * @return true - если удалили
     *         false - если удалить не получилось
     */
    public boolean delete(int index) {
        if (isIndexOutOfBound(index)) { return false; }

        for (int i = index; i < this.data.length - 1; i++) {
            this.data[i] = this.data[i+1];
        }

        this.data = Arrays.copyOf(this.data, this.data.length - 1);
        return true;
    }

    /**
     * Метод удаляет первый найденный элемент контейнера, эквивалентный переданному
     * @param item элемент
     * @return true - если если удалили
     *         false - если удалить не получилось
     */
    public boolean delete(T item) {
        for (int i = 0; i < this.data.length; i++) {
            if (Objects.equals(this.data[i], item)) {
                return delete(i);
            }
        }
        return false;
    }

    /**
     * Метод сортирует контейнер с помощью переданного компаратора
     * @param comparator переданный компаратор
     */
    public void sort (Comparator<T> comparator) {
        sort(this, comparator);
    }

    /**
     * Статический метод сортирует контейнер с помощью реализации интерфейса Comparable
     * @param dataContainer контейнер для сортировки
     * @param <E> хранимый тип элементов контейнера
     */
    public static <E extends Comparable<E>> void sort (DataContainer<E> dataContainer) {
        boolean isSorted;
        do {
            isSorted = true;
            for (int i = 1; i < dataContainer.data.length; i++) {
                if (dataContainer.data[i].compareTo(dataContainer.data[i - 1]) < 0) {
                    E temp = dataContainer.data[i - 1];
                    dataContainer.data[i - 1] = dataContainer.data[i];
                    dataContainer.data[i] = temp;
                    isSorted = false;
                }
            }
        } while (!isSorted) ;
    }

    /**
     * Статический метод сортирует контейнер с помощью переданного компаратора
     * @param dataContainer контейнер для сортировки
     * @param comparator переданный компаратор
     * @param <E> хранимый тип элементов контейнера
     */
    public static <E> void sort (DataContainer<E> dataContainer, Comparator<E> comparator) {
        boolean isSorted;
        do {
            isSorted = true;
            for (int i = 1; i < dataContainer.data.length; i++) {
                if (comparator.compare(dataContainer.data[i], dataContainer.data[i - 1]) < 0) {
                    E temp = dataContainer.data[i - 1];
                    dataContainer.data[i - 1] = dataContainer.data[i];
                    dataContainer.data[i] = temp;
                    isSorted = false;
                }
            }
        } while (!isSorted) ;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String prefix = "";
        for (T arr: this.data) {
            if (arr != null) {
                stringBuilder.append(prefix);
                prefix = ", ";
                stringBuilder.append(arr);
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Метод проверяет "выходит ли индекс" за границы хранилиша
     * @param index проверяемый индекс
     * @return true - если индекс "выходит за границы"
     *         false - если "не выходит"
     */
    private boolean isIndexOutOfBound(int index) {
        return index >= this.data.length || index < 0;
    }
}
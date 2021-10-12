package home_work_5;

public class Student {
    /**
     * num - порядковый номер
     * name - имя
     * age - возраст
     * mark - оценка
     * olympiad -участие в олимпиаде (true / false)
     */
    private int num;
    private String name;
    private int age;
    private double mark;
    private boolean olympiad;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public boolean isOlympiad() {
        return olympiad;
    }

    public void setOlympiad(boolean olympiad) {
        this.olympiad = olympiad;
    }
}

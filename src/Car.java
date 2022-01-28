import java.util.Comparator;

public class Car implements Comparator<Car> {
    private int age;
    private int gas;

    public Car() {
        this(0,0);
    }

    public Car(int age, int gas) {
        this.age = age;
        this.gas = gas;
    }

    @Override
    public int compare(Car o1, Car o2) {
        if (o1.gas > o2.gas) return 1;
        else if (o1.gas == o2.gas) return 0;
        else return -1;
    }
}

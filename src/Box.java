import java.util.ArrayList;

public class Box<T> {
    private ArrayList item = new ArrayList<T>();
    void add(T item) {
        this.item.add(item);
    }
}

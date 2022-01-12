import java.util.ArrayList;

public class Box<T> {
    private ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        this.list.add(item);
    }

    T get(int i) {
        return this.list.get(i);
    }

    int getSize() {
        return this.list.size();
    }

    public String toString(){
        return this.list.toString();
    }

}

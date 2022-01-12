public class Box<T> {
    T item;

    Box(){
        this(null);
    }

    Box (T item) {
        this.item = item;
    }

    void setItem(T item){
        this.item = item;
    }

    T getItem(){
        return this.item;
    }
}

import java.util.Arrays;
import java.util.Comparator;

public class main {

    public static void main(String args[]) {
        Integer[] arr = {4,2,3,1};
        Arrays.sort(arr, new Descending());
        for (int a : arr) {
            System.out.println(a);
        }
    }
}

class Descending implements Comparator {
    public int compare(Object o1, Object o2){
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2);
        }
        return -1;
    }
}
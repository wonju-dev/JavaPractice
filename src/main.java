import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class main {

    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = Arrays.copyOf(arr,3);
        int[] arr3 = Arrays.copyOfRange(arr,0,10);
        Iterator it = Arrays.stream(arr2).iterator();
        Iterator it2 = Arrays.stream(arr3).iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}

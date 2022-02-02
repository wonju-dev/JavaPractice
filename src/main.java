import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4};
        Stream<Integer> stream = Arrays.stream(array);
        Stream<Integer> partialStream = Arrays.stream(array, 1,3);

        Iterator it1 = stream.iterator();
        while (it1.hasNext()) System.out.println(it1.next());

        Iterator it2 = partialStream.iterator();
        while (it2.hasNext()) System.out.println(it2.next());
    }
}

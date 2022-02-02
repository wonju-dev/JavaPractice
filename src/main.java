import java.util.*;
import java.util.stream.Stream;


public class main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(array));

        Stream<Integer> listStream = list.stream();
        Stream<Integer> setStream = set.stream();

        listStream.forEach((number)->System.out.println(number));
        setStream.forEach((number)->System.out.println(number));
    }
}

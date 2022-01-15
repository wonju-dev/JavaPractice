import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class main {

    public static void main(String args[]) {
        TreeSet ts = new TreeSet();
        Integer[] array = {1,5,2,4,3};
        for (Integer integer : array) ts.add(integer);

        System.out.println(ts.subSet(2,4));
        System.out.println(ts.headSet(3));
        System.out.println(ts.tailSet(3));

    }
}

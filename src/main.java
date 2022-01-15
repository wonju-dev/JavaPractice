import java.util.*;

public class main {

    public static void main(String args[]) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();

        List l = new LinkedList(hs); // linekdlist는 collection을 구현하는 class는 전부 가능한 듯?
        Collections.sort(l); // Hashset 정렬을 위해 linkedlist로 감싸준다
        Iterator it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

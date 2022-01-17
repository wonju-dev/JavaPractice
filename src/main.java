import java.util.*;

public class main {
    public static void main(String args[]) {
        List syncList = Collections.synchronizedList(new ArrayList());
        syncList.add(1);
        syncList.add(2);
        syncList.add(3);

        Iterator it = syncList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        List readOnlyList = Collections.unmodifiableList(new ArrayList(syncList));
        // readOnlyList.set(3,4);
        // readOnlyList.add(1);
        Iterator it2 = readOnlyList.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        List singletonList = Collections.singletonList(new Object());
        // singletonList.add(2);
        System.out.println(singletonList);

        List checkedList = Collections.checkedList(syncList, String.class);
        checkedList.add("1");
        // checkedList.add(1);
        Iterator it3 = checkedList.iterator();
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }
    }
}

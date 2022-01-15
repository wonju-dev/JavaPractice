import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class main {

    public static void main(String args[]) {
        ArrayList al = new ArrayList();
        LinkedList ll = new LinkedList();

        ll.add('a');
        ll.add('b');
        ll.add('c');

        al.add(1);
        al.add(2);
        al.add(3);

        Iterator iterator = al.iterator();
        Iterator iterator2 = ll.iterator();

        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

        while (iterator2.hasNext()) {
            Object obj = iterator2.next();
            System.out.println(obj);
        }
    }
}

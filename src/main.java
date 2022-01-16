import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class main {

    public static void main(String args[]) {
        HashMap<String, Object> hm = new HashMap<String, Object>();
        hm.put("key1", new Integer(1)); // hm.put("1", 1);

        Set entries = hm.entrySet();
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(hm.containsKey("1"));
        System.out.println(hm.containsValue(1));

        HashMap hm2 = new HashMap();
        hm2.put("1", 1);
        hm2.put('2',2);
        System.out.println(hm2.containsKey("2"));
    }
}

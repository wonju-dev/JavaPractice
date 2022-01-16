import java.util.*;

public class main {

    public static void main(String args[]) {
        HashMap<String, Object> hm = new HashMap<String, Object>();
        hm.put("key1", new Integer(1)); // hm.put("1", 1);
        hm.put("key2", new Integer(2));

        Set entries = hm.entrySet();
        System.out.println(entries);
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            System.out.println(it.next() instanceof Map.Entry);
        }

        Set keySet = hm.keySet(); // key를 set으로 반환
        Iterator keySetIT = keySet.iterator();
        while (keySetIT.hasNext()) {
            System.out.println(keySetIT.next());
        }

        Collection values = hm.values();
        Iterator valueIt = values.iterator();
        while (valueIt.hasNext()){
            System.out.println(valueIt.next());
        }

        System.out.println(hm.containsKey("1"));
        System.out.println(hm.containsValue(1));

        HashMap hm2 = new HashMap();
        hm2.put("1", 1);
        hm2.put('2',2);
        System.out.println(hm2.containsKey("2"));
    }
}

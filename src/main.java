import java.util.*;

public class main {
    public static void main(String args[]) {
        String[] data = {"a","b","c","d","a","c","d","a","c","a"};
        TreeMap tp = new TreeMap();

        for (int i = 0 ; i < data.length ; i++){
            if (tp.containsKey(data[i])) {
                int value = (int) tp.get(data[i]);
                tp.put(data[i], value + 1);
                System.out.printf("%s %d \n",data[i], value);
            } else {
                tp.put(data[i], 1);
            }
        }

        Iterator it = tp.values().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(tp.get("a"));

   }
}

import java.util.ArrayList;
import java.util.TreeSet;

public class main {
    public static void main(String args[]) {

        ArrayList<Integer> list1 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        ArrayList<Integer> kyo = new ArrayList(); // 교집합
        ArrayList<Integer> cha = new ArrayList(); // 차집합
        ArrayList<Integer> hap = new ArrayList(); // 합집합

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // kyo
        for (int num : list1) {
            if (list2.contains(num)) kyo.add(num);
        }
        // cha
        cha = (ArrayList) list1.clone();
        for (int num : list2) {
            cha.remove((Integer) num);
        }
        // hap
        hap.addAll(list1);
        hap.addAll(list2);
        TreeSet ts = new TreeSet(hap);
        hap = new ArrayList(ts);

        System.out.println("list1=" + list1);
        System.out.println("list2=" + list2);
        System.out.println("kyo=" + kyo);
        System.out.println("cha=" + cha);
        System.out.println("hap=" + hap);
    }
}

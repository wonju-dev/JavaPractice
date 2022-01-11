import java.util.*;
import java.lang.Integer;

public class main {
    public static void main(String args[]) {
        Point p1 = new Point(1,2);
        Point p2 = p1.clone();

        System.out.println(p1.toString());
        p2.x = 100;
        System.out.println(p2.toString());

        int[] a1 = {1,2,3,4};
        int[] a2 = a1.clone();
        a1[0] = 100;
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }
}

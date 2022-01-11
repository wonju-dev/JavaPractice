import java.util.*;
import java.lang.Integer;

public class main {
    public static void main(String args[]) {
        Circle c1 = new Circle(new Point(1,2));
        Circle c2 = c1.clone();
        Circle c3 = c1; // Shallow copy
        System.out.println(c1.point.toString());
        System.out.println(c2.point.toString());
        System.out.println(c3.point.toString());

        c1.point.x = 100;
        System.out.println(c1.point.toString());
        System.out.println(c2.point.toString());
        System.out.println(c3.point.toString());

    }
}

import java.util.*;

public class main {
    public static void main(String args[]) {
        MyMethod f = new MyMethod() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };
        System.out.println(f.max(5,6));
    }
}

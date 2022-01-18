import java.util.*;

public class main {
    public static void main(String args[]) {
        MyMethod f = () -> System.out.println("lambda");
        aMethod(f);
    }

    static void aMethod(MyMethod f) {
        System.out.println("hi");
        f.max();
    }
}


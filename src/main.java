import java.util.*;

public class main {
    public static void main(String args[]) {
        MyMethod f = () -> System.out.println("lambda");
        aMethod(f);

        MyMethod ff = bMethod();
        ff.max();
    }

    static void aMethod(MyMethod f) {
        System.out.println("hi");
        f.max();
    }

    static MyMethod bMethod() {
        MyMethod f = () -> System.out.println("new Lambda");
        return f;
    }
}


import java.util.*;
import java.lang.Integer;

public class main {
    public static void main(String args[]) {
        System.out.println(Computer.a);
        Computer myComputer = new Computer(1);
        System.out.println(myComputer.a);
        System.out.println(Computer.a);
        System.out.println(returnFloat(10));
    }

    static float returnFloat(int a) {
        return a; // typecasting
    }
}

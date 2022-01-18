import java.util.function.Predicate;

public class main {
    public static void main(String args[]) {
        Predicate<String> isEmptyStr = s -> s.length() == 0;
        System.out.println(isEmptyStr.test("s"));
        System.out.println(isEmptyStr.test(""));
    }
}


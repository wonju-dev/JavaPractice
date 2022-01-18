import java.util.function.Function;
import java.util.function.Predicate;

public class main {
    public static void main(String args[]) {
        Function<String, Integer> f = (s) -> Integer.parseInt(s); // String -> int
        Function<Integer, String> g = (s) -> Integer.toBinaryString(s); // 10 -> 2
        Function<String, String> h = f.andThen(g);
        System.out.println(h.apply("10"));
        Function<Integer, Integer> h2 = f.compose(g);
        System.out.println(h2.apply(10));

    }
}

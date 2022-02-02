import java.util.stream.Stream;


public class main {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("a", "b", "C");
        Stream<String> stream2 = Stream.of("d", "e", "f");
        Stream<String> stream3 = Stream.concat(stream1, stream2);

        stream3.forEach((c)-> System.out.println(c));

    }
}

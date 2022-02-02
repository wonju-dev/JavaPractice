import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;


public class main {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 5); // [1,2,3,4]
        LongStream longStream = LongStream.rangeClosed(1, 5); // [1, 2, 3, 4, 5]
        DoubleStream doubleStream = DoubleStream.builder().add(1).add(2).add(3).build(); // [1, 2, 3]

        Stream<Integer> intStream2 = IntStream.range(1, 5).boxed();
        Stream<Long> longStream2 = LongStream.range(1, 5).boxed();
        Stream<Double> doubleStream2 = DoubleStream.builder().add(1).add(2).add(3).build().boxed();
    }
}

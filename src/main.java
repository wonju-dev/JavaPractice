import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;


public class main {
    public static void main(String[] args) {
        DoubleStream doubleStream = new Random().doubles(3);
        doubleStream.forEach((number) -> System.out.println(number));

        IntStream intStream = new Random().ints(3);
        intStream.forEach((number) -> System.out.println(number));
    }
}

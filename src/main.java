import java.util.Optional;

public class main {
    public static void main(String args[]) {
        try {
            Object result1 = Optional.of(null); // Error
        } catch (NullPointerException e) {
            Object result2 = Optional.of(new Object()); // Not Error
            System.out.println(result2);
        }

        Optional<Object> result3 = Optional.ofNullable(null);
        Optional<Object> result4 = Optional.ofNullable(new Object());
        Object result5 = result4.get();
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}

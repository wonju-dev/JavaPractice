import java.util.Optional;

public class main {
    public static void main(String args[]) {
        try {
            Object result1 = Optional.of(null); // Error
        } catch (NullPointerException e) {
            Object result2 = Optional.of(new Object()); // Not Error
            System.out.println(result2);
        }

        Object result3 = Optional.ofNullable(null);
        Object result4 = Optional.ofNullable(new Object());
        System.out.println(result3);
        System.out.println(result4);
    }
}

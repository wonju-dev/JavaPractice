import java.util.Optional;

public class main {
    public static void main(String args[]) {
        try {
            Object result1 = Optional.of(null); // Error
        } catch (NullPointerException e) {
            Object result2 = Optional.of(new Object()); // Not Error
            System.out.println(result2);
        }
    }
}

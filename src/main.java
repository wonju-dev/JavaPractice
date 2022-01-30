import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class main {
    public static void main(String[] args) {
        Class c1 = new Class(new Teacher("teacher#1"));
        for (int i = 0; i < 10; i++) {
            c1.addNewStudent(new Student("student#" + i));
        }

        System.out.println(c1.findAllStudent());
        System.out.println(c1.findStudent(5).get());
    }
}

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;


public class main {
    public static void main(String[] args) {
        Runnable runnable = Student::printHi;
        runnable.run();

        Runnable runnable1 = new Student(1,"1")::printHello;
        runnable1.run();

        BiFunction<Integer, String, Student> studentSupplier = Student::new;
        Student newStudent = (Student) studentSupplier.apply(10, "wonju");
        System.out.println(newStudent);

        Predicate<Student> studentChecker = newStudent::equals;
        System.out.println(studentChecker.test(new Student()));

    }
}

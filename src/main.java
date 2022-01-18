import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.BiConsumer;
import java.lang.Runnable;

public class main {
    public static void main(String args[]) {
        Predicate<String> isEmptyStr = s -> s.length() == 0;
        System.out.println(isEmptyStr.test("s"));
        System.out.println(isEmptyStr.test(""));

        Runnable printHi = () -> System.out.println("hi");
        printHi.run();

        Supplier<String> getWelcomeMessage = () -> "welcome!";
        String welcomeMessage = getWelcomeMessage.get();
        System.out.println(welcomeMessage);

        Supplier<Person> getNewPerson = () -> new Person("no name", 0);
        Person p1 = getNewPerson.get();
        System.out.println(p1);

        BiConsumer<Person, String> setName = (Person p, String newName) -> p.name = newName;
        setName.accept(p1, "new name");
        System.out.println(p1);

    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "name : '" + this.name + "'age : " + this.age;
    }
}
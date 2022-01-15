import java.util.*;

public class main {

    public static void main(String args[]) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("a", 1));
        set.add(new Person("a", 1));
        set.add(new Person2("b", 2));
        set.add(new Person2("b", 2));
        System.out.print(set); // [abc, Person, Person, Person2]
    }
}

class Person { // Person Class에 equals(), hashCode()가 없으므로, Super Class (Object)의 method를 사용한다
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Person2 {
    String name;
    int age;

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Person2)) return false;

        Person2 p2 = (Person2) obj;
        return this.name.equals(p2.name) && this.age == p2.age;
    }

    public int hashCode() {
        return Objects.hash(name + age); // JDK 1.8에 추가된 Object class의 hash함수를 이용해서 새로운 hashCode를 생성할 수 있다
        // return (name+age).hashCode(); // JDK 1.8 이전버전, 되도록 위의 방법을 사용하자
    }
}
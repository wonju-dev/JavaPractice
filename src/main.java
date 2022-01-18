import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class main {
    public static void main(String args[]) {
        ArrayList<Person> memberList = new ArrayList<Person>();
        for (int i = 0 ; i < 10 ; i++) memberList.add(new Person("name"+i ,i));

        memberList.replaceAll((Person p)-> {
            String nameIndex = p.name.substring(4);
            if (Integer.parseInt(nameIndex) % 2 == 0) p.name = p.name + nameIndex;
            else p.name = p.name + nameIndex + nameIndex;
            return p;
        });
        memberList.forEach((Person p)->System.out.println(p));
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
        return "name : '" + this.name + "' age : " + this.age;
    }
}
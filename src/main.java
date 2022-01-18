import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.UnaryOperator;

public class main {
    public static void main(String args[]) {
        ArrayList<Person> memberList = new ArrayList<Person>();
        Map<String, String > phoneNumber = new HashMap<String, String>();

        for (int i = 0 ; i < 10 ; i++) {
            String name = "name"+i;
            Person newPerson = new Person(name, i);
            memberList.add(newPerson);
            phoneNumber.put(name, ""+i+i+i);
        }

        memberList.replaceAll((Person p)-> {
            String nameIndex = p.name.substring(4);
            if (Integer.parseInt(nameIndex) % 2 == 0) p.name = p.name + nameIndex;
            else p.name = p.name + nameIndex + nameIndex;
            return p;
        });

        memberList.forEach((Person p)->System.out.println(p));
        Iterator it = phoneNumber.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


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
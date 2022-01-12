import basicInfomation.Person;

public class Parent extends Person {
    Parent() {
        super();
    }

    Parent(String name, int id, int age) {
        super(name, id, age);
    }

    void parentMethod(){
        System.out.println("parent method");
    }
}

public class GrandChild extends Child{
    GrandChild(){
        super();
    }

    GrandChild(String name, int id, int age) {
        super(name, id, age);
    }

    void grandChildMethod(){
        System.out.println("only for grandChild");
    }
}

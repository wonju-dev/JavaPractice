public class main {

    public static void main(String args[]) {
        GrandChild gc1 = new GrandChild();
        GrandChild gc2 = new GrandChild("a", 1,2);
        Child c1 = new Child();
        Child c2 = new Child("b",3,4);
        Parent p1 = new Parent();
        Parent p2 = new Parent("c",5,6);

        System.out.println(gc1.getName());
        System.out.println(gc2.getAge());
        System.out.println(c1.getId());
        System.out.println(c2.getName());
        System.out.println(p1.getAge());
        System.out.println(p2.getId());

    }
}


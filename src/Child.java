public class Child extends Parent {
    Child(int age){
        super(age);
        System.out.println("hi");
    }

    void play(){
        System.out.printf("%d years old baby is playing", age);
    }
}

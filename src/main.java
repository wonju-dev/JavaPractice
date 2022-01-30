public class main {
    public static void main(String[] args) {
        MyLambda f = () -> System.out.println("hihi");
        triggerLambda(f);

        MyLambda ff = changeMessage("hello");
        ff.printHello();
    }

    static void triggerLambda (MyLambda f) {
        f.printHello();
    }

    static MyLambda changeMessage (String message) {
        return () -> System.out.println(message);
    }
}


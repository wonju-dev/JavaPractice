public class main {
    public static void main(String[] args) {
        MyLambda f = () -> System.out.println("hihi");

        MyLambda ff = changeMessage("hello");

        System.out.println(MyLambda.class);
        System.out.println(f.getClass());
        System.out.println(ff.getClass());

    }

    static void triggerLambda (MyLambda f) {
        f.printHello();
    }

    static MyLambda changeMessage (String message) {
        return () -> System.out.println(message);
    }
}


public class main {
    public static void main(String args[]) {
        Singleton mySingleton = Singleton.getInstance();
        Singleton yourSingleton = Singleton.getInstance();
        System.out.println(mySingleton == yourSingleton);
    }
}

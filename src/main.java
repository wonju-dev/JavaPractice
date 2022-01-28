public class main {
    public static void main(String args[]) {
        Car c1 = new Car();
        Car c2 = new Car(2, 2);
        Car c3 = new Car(3, 3);

        System.out.println(c1.compare(c2, c3));

    }
}

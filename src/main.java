public class main {
    public static void main(String args[]) {
        Box<Apple> appleBox = new Box<Apple>();
        Box<Grape> grapeBox = new Box<Grape>();
        Box<Fruit> fruitBox = new Box<Fruit>();

        appleBox.add(new Apple());
        grapeBox.add(new Grape());
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        System.out.println(appleBox.toString());
        System.out.println(grapeBox.toString());
        System.out.println(fruitBox.toString());
    }
}

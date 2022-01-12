public class main {
    public static void main(String args[]) {
        Box<Apple> appleBox = new FruitBox<Apple>();
        Box<Grape> grapeBox = new FruitBox<Grape>();
        Box<Fruit> fruitBox = new FruitBox<Fruit>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        fruitBox.add(new Fruit());
        // fruitBox.add(new Toy());
        appleBox.add(new Apple());
        // appleBox.add(new Grape());

        System.out.println(appleBox.toString());
        System.out.println(grapeBox.toString());
        System.out.println(fruitBox.toString());
    }
}

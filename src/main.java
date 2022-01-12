public class main {
    public static void main(String args[]) {
        Box<Apple> appleBox = new Box<Apple>();
        Box<Grape> grapeBox = new Box<Grape>();
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<PoisonApple> posionAppleBox =new Box<PoisonApple>();
        Box<Toy> toyBox = new Box<Toy>();

        appleBox.add(new Apple());
        appleBox.add(new PoisonApple());
        toyBox.add(new Toy());
        // toyBox.add(new Apple());
        // appleBox.add(new Toy());
        // appleBox.add(new Fruit());
        // appleBox.add(new Grape());

        FruitBox<Apple> appleFruitBox = new FruitBox<Apple>();
        FruitBox<Fruit> fruitFruitBox = new FruitBox<Fruit>();
        FruitBox<PoisonApple> poisonAppleFruitBox = new FruitBox<PoisonApple>();
        // FruitBox<Toy> toyFruitBox = new FruitBox<Toy>();

        appleFruitBox.add(new Apple());
        appleFruitBox.add(new PoisonApple());
        // appleFruitBox.add(new Grape());
        // appleFruitBox.add(new Fruit());
        // appleFruitBox.add(new Toy());
        fruitFruitBox.add(new Apple());
        fruitFruitBox.add(new Grape());
        fruitFruitBox.add(new Fruit());
        fruitFruitBox.add(new PoisonApple());
        // fruitFruitBox.add(new Toy());
        // poisonAppleFruitBox.add(new Apple());
        poisonAppleFruitBox.add(new PoisonApple());
    }
}

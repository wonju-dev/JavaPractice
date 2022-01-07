public class Product {
    private int price;
    private int bonus;

    Product(int price, int bonus){
        this.price = price;
        this.bonus = bonus;
    }

    public int getPrice() { return this.price; }
    public int getBonus() { return this.bonus; }
    public void setPrice(int price) { this.price = price; }
    public void setBonus(int bonus) { this.price = bonus; }

}

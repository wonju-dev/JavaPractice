public class Customer {
    private int money;
    private int bonusPoint;

    Customer(int money, int bonusPoint) {
        this.money = money;
        this.bonusPoint = bonusPoint;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void buy(Product product){
        this.money -= product.getPrice();
        this.bonusPoint += product.getBonus();
    }
}

public class Customer {
    private int money;
    private int bonusPoint;
    private Product[] bag;

    Customer(int money, int bonusPoint) {
        this.money = money;
        this.bonusPoint = bonusPoint;
        this.bag = new Product[100];
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

    public void buy(Product product) {
        for (int i = 0; i < this.bag.length; i++) {
            if (bag[i] == null) {
                bag[i] = product;
                break;
            }
        }
        this.money -= product.getPrice();
        this.bonusPoint += product.getBonus();
    }

    public void showBagList() {
        for (int i = 0 ; i < this.bag.length ; i++) {
            if (bag[i] == null) break;
            System.out.println(bag[i].toString());
        }
    }
}

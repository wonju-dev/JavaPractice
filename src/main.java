public class main {
    public static void main(String args[]) {
        Customer me = new Customer(10000,0);
        me.buy(new Computer());
        me.buy(new Tv());
        me.buy(new Tv());
        me.showBagList();
    }
}
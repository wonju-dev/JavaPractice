package card;

public class Card {
    private int num;
    private boolean isKwang;

    public Card() {
        this(1, true);
    }

    public Card(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public void info() {
        String isKwang = this.isKwang == true ? "K" : "";
        System.out.printf("%d%s\n", this.num, isKwang);
    }
}

public class Card {
    static final int CARD_NUM_PER_TYPE = 13;
    static final int CARD_TYPE_NUM = 4;
    static final String[] CARD_TYPE = {"H", "D", "S", "C"};
    String type;
    int number;

    Card(int type, int number){
        this.type = CARD_TYPE[type];
        this.number = number;
    }
}

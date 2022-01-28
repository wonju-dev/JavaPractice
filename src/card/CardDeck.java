package card;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private static final int NUMBER_OF_CARD = 20;
    private static final ArrayList<Integer> kwangNumbers = new ArrayList();
    private List<Card> deck = new ArrayList(NUMBER_OF_CARD);

    static {
        kwangNumbers.add(1);
        kwangNumbers.add(3);
        kwangNumbers.add(8);
    }

    public CardDeck() {
        for (int i = 1; i <= 10; i++) {
            if (kwangNumbers.contains(i)) {
                deck.add(new Card(i,true));
            } else {
                deck.add(new Card(i, false));
            }
                deck.add(new Card(i, false));
        }
    }

    public void showCards() {
        for (Card card : deck) {
            card.info();
        }
    }
}

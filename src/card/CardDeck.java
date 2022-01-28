package card;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private static final int NUMBER_OF_CARD = 20;
    private static final ArrayList<Integer> kwangNumbers = new ArrayList();
    private List<Card> cards = new ArrayList(NUMBER_OF_CARD);

    static {
        kwangNumbers.add(1);
        kwangNumbers.add(3);
        kwangNumbers.add(8);
    }

    public CardDeck() {
        for (int i = 1; i <= 10; i++) {
            if (kwangNumbers.contains(i)) cards.add(new Card(i, true));
            else cards.add(new Card(i, false));
            cards.add(new Card(i, false));
        }
    }

    public void showCards() {
        for (Card card : cards) {
            card.info();
        }
    }

    public void shuffle() {
        for (int i = 0; i < NUMBER_OF_CARD; i++) {
            Card from = cards.get(i);
            int randomIndex = getRandomNumber();
            Card to = cards.get(randomIndex);
            cards.set(randomIndex, from);
            cards.set(i, to);
        }
    }

    private static int getRandomNumber() {
        String i = (Math.random() + "").substring(2, 4);
        return Integer.parseInt(i) % NUMBER_OF_CARD;
    }
}

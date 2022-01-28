import card.Card;
import card.CardDeck;


public class main {
    public static void main(String args[]) {
        CardDeck cardDeck = new CardDeck();
        cardDeck.shuffle();
        cardDeck.showCards();
    }
}

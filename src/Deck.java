public class Deck {
    Card[] cards = new Card[Card.CARD_NUM_PER_TYPE * Card.CARD_TYPE_NUM];

    Deck() {
        int index = 0;
        for (int i = 0 ; i < Card.CARD_TYPE_NUM ; i++) {
            for (int j = 0 ; j < Card.CARD_NUM_PER_TYPE ; j ++) {
                this.cards[index] = new Card(i, j);
                index++;
            }
        }
    }

    Card pop() {
        Card poppedCard = this.cards[this.cards.length-1];
        Card[] newDeck = new Card[this.cards.length-1];
        for (int i = 0 ; i < newDeck.length ; i++) {
            newDeck[i] = this.cards[i];
        }
        this.cards = newDeck;
        return poppedCard;
    }
}
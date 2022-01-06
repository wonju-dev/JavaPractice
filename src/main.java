public class main {
    public static void main(String args[]){
        Deck myDeck = new Deck();
        for (int i = 0 ; i< 10 ; i++) {
            Card poppedCard = myDeck.pop();
            System.out.printf("%s %d \n ", poppedCard.type, poppedCard.number);
        }
    }
}

package poker.model;

public class Player {
    private Card[] cards = new Card[5];
    private Integer cardCount = 0;



    public  void addCard(Card card){
        this.cardCount++;
        this.cards[this.cardCount-1] = card;

    }

    public Integer getCardCount() {
        return cardCount;
    }

    public void printCards(){
        if (cardCount>0) {
            System.out.print("Player cards: ");
            for (int i = 0; i < this.cardCount; i++) {
                System.out.print(this.cards[i] + " ");

            }
            System.out.println();
        } else {
            System.out.print("Player have no cards");
            System.out.println();
        }
    }
}

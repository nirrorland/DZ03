package poker.model;

import java.util.Random;

public class Deck {

    private  Card[] cards = new Card[52];

    public Card[] getCards() {
        return cards;
    }

    public Deck() {
        int count = 0;
        for (int i = 0; i < Suits.getSuits().length; i++) {
            for (int j = 0; j < Values.getValues().length ; j++) {
                this.cards[count] = new Card();
                this.cards[count].setSuit(Suits.getSuits()[i]);
                this.cards[count].setValue(Values.getValues()[j]);
                count++;
            }

        }
    }

    public void printDeck(){
        for (int i = 0; i < this.cards.length; i++) {
            System.out.println(cards[i].toString());

        }

    }

    public void shuffledeck() {
        Card[] newCards = new Card[52];

        Random random = new Random();
        Integer r = null;

        System.out.println();
        System.out.println("Shuffling deck:");

        for (int i = 0; i < this.cards.length; i++) {


            r = random.nextInt(52);

                if ((r>=0)&&(r<newCards.length)&&(newCards[r]==null)) {
                    newCards[r]=this.cards[i];
                    System.out.println(i + " -> " + r);
                } else {
                    i--;
                }
        }
        System.out.println("Deck shuffled");
        this.cards = newCards;
    }

}

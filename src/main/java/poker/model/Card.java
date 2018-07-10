package poker.model;

public class Card implements Comparable{
    private String suit;
    private String value;

    @Override
    public String toString() {
        return "Card{" +
                 suit + " : " + value +
                "};";
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {
        Card item = (Card) o;
        if(this.value.getBytes()[0] >item.value.getBytes()[0]) {
            return 0;
        } else {
            return 1;
        }

    }
}

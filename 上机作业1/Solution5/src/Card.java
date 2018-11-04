
public class Card {
    protected int number;
    protected String suit; // Heart, Spade, Diamond, Club

    public Card(int n, String s) {
        // TODO 3.1
        number = n;
        suit = s;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }


}

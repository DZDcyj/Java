import java.io.StringReader;
import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;
    Random random;

    public Deck() {
        this.cards = new ArrayList<Card>();
        this.random = new Random();
        // create all the cards
        this.generateDeck();
    }

    /*
     * Generate all the cards for a deck
     * the cards are stored in the member variable - cards
     */
    private void generateDeck() {
        // TODO 3.1
        String [] suit=new String[4];
        suit[0]="Heart";
        suit[1]="Diamond";
        suit[2]="Spade";
        suit[3]="Club";
        for(int i=1;i<=13;i++){
            for (int j=0;j<suit.length;j++){
                Card card=new Card(0,"");
                card.number=i;
                card.suit=suit[j];
                cards.add(card);
            }
        }
    }

    /*
     * Return a random card, remove it from the deck
     */
    public Card getRandomCard() {
        int index = this.random.nextInt(this.cards.size());
        return this.cards.remove(index);
    }

    /*
     * Create a CardGroup by picking 3 cards randomly
     */
    public CardGroup createRandomCardGroup() {
        // TODO 3.1
        Card c1=getRandomCard();
        Card c2=getRandomCard();
        Card c3=getRandomCard();
        CardGroup group=new CardGroup(c1,c2,c3);
        return group;// to be replaced
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        CardGroup cg1 = deck.createRandomCardGroup();
        CardGroup cg2 = deck.createRandomCardGroup();
        CardGroup cg3 = deck.createRandomCardGroup();
        int check1,check2,check3;
        check1=cg1.compare(cg2);
        check2=cg1.compare(cg3);
        check3=cg2.compare(cg3);
        int cg=0;
        if (check1==1&&check2==1)
            cg=1;
        if(check1==-1&&check3==1)
            cg=2;
        if(check3==-1&&check2==-1)
            cg=3;
        System.out.print("cg1");
        cg1.post();
        System.out.print("cg2");
        cg2.post();
        System.out.print("cg3");
        cg3.post();
        if(cg==1||cg==2||cg==3)
        System.out.println("The biggest CardGroup is cg"+cg+".");
        if(cg==0)
            System.out.println("There are at least 2 CardGroups in the same level.");

        // TODO 3.4
        // print out the biggest CardGroup
    }
}

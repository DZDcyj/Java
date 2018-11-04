public class CardGroup {
    private Card c1;
    private Card c2;
    private Card c3;
    private int sum;//Sum of numbers
    private int num=1;//The number of same numbers
    private int result=1;//Check if the suits are same
    private int check;//The result of compare
    private String message;
    public CardGroup(Card c1, Card c2, Card c3) {
        // TODO 3.1
        sum=c1.number+c2.number+c3.number;
        if (c1.number==c2.number)
            num++;
        if (c1.number==c3.number)
            num++;
        if (c2.number==c3.number)
            num++;
        if(!c1.suit.equals(c2.suit)||!c1.suit.equals(c3.suit)||!c2.suit.equals(c3.suit))
            result=0;
        message=" CardGroup includes ["+c1.suit+c1.number+","+c2.suit+c2.number+","+c3.suit+c3.number+"]";
    }

    /*
     * Return the number of cards with the same number
     */
    public int numOfSameNumber() {
        // TODO 3.2
        return num; // to be replaced
    }

    /*
     * Return the sum of all 3 numbers.
     */
    public int sumOfNumbers() {
        return sum; // to be replaced
    }
    public int IsSuitSame(){
        return result;
    }
    /*
     * Compare if it is bigger than CardGroup c
     * @param c another CardGroup
     * @return 1: bigger than c; 0: the same; -1: smaller than c.
     */
    public int compare(CardGroup c) {
        // TODO 3.4
        if (this.IsSuitSame()>c.IsSuitSame())
            check=1;
        else if(this.IsSuitSame()==1&&c.IsSuitSame()==1)
            check=0;
        else if(this.IsSuitSame()==c.IsSuitSame() && this.numOfSameNumber()>c.numOfSameNumber())
            check=1;
        else if (this.IsSuitSame()==c.IsSuitSame()&&this.numOfSameNumber()==c.numOfSameNumber())
            check=0;
        else
            check=-1;
        return check; // to be replaced
    }
    public void post(){
        System.out.println(message);
    }
}

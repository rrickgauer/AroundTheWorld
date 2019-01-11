
public class Card
{

    private String suit;
    private String rank;

    public Card(final String newSuit, final String newRank)
    {
	suit = newSuit;
	rank = newRank;
    }

    public String getSuit()
    {
	return suit;
    }

    public String getRank()
    {
	return rank;
    }

    public void setSuit(final String newSuit)
    {
	suit = newSuit;
    }

    public void setRank(final String newRank)
    {
	rank = newRank;
    }

    void print()
    {
	System.out.println(rank + " " + suit);
    }

}



/**
 * This is the deck of cards for the application
 *
 * It represents the model for my MVC program
 */
public class Deck
{
    // Possible card ranks
    private String ranks[] =
    {
	"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"
    }; 
    
    // Possible suit ranks
    String suits[] =
    {
	"CLUB", "DIAMOND", "HEART", "SPADE"
    }; 

    private int reds;		// number of red cards remaining
    private int blacks;		// number of black cards remaining
    private int numClubs;	// number of clubs remaining
    private int numDiamonds;	// number of diamonds remaning
    private int numHearts;	// number of hearts remaning
    private int numSpades;	// number of spades remaining
    private int totalCards;	// number of total cards remaining
    private int rankTotals[];	// number of each rank remaining

    public Deck()
    {
	reds = 26;		// 26 reds
	blacks = 26;		// 26 blacks
	numClubs = 13;		// 13 clubs
	numDiamonds = 13;	// 13 diamonds
	numHearts = 13;		// 13 hearts
	numSpades = 13;		// 13 spades
	totalCards = 52;	// 52 cards at initializization
	resetRankTotals();	// initializes the number of ranks to 4

    }

    /////////////////////////////////////////////////
    /**
     * Resets the rank totals in cases when the guess is wrong
     *///////////////////////////////////////////////
    public void resetRankTotals()
    {
	rankTotals = new int[13];
	int count;
	for (count = 0; count < 13; count++)
	{
	    rankTotals[count] = 4;
	}
    }

    /**
     * Updates the totals of the deck after every round
     *
     */
    public void updateTotals(String newRank, String newSuit)
    {
	if (null == newSuit)
	{
	    System.out.println("Invalid suit entered");
	}
	else // Updates suit counts
	{
	    switch (newSuit)
	    {
		case "CLUB":
		    numClubs--;
		    blacks--;
		    break;
		case "DIAMOND":
		    numDiamonds--;
		    reds--;
		    break;
		case "HEART":
		    numHearts--;
		    reds--;
		    break;
		case "SPADE":
		    numSpades--;
		    blacks--;
		    break;
		default:
		    System.out.println("Invalid suit entered");
		    break;
	    }
	}

	// Updates total cards
	totalCards--;

	// Updates number of rank values
	int rankIndex = cardIndex(newRank);
	rankTotals[rankIndex] = rankTotals[rankIndex] - 1;

    }

    public int cardIndex(String newRank)
    {
	for (int count = 0; count < 13; count++)
	{
	    if (ranks[count].equalsIgnoreCase(newRank))
	    {
		return count;
	    }
	}

	return -1;
    }

    // first test of the game because the controller cannot return anything
    public String firstTest()
    {
	if (reds < blacks)
	    return "BLACK";
	else
	    return "RED";

    }

    /**
     * First Test Red or Black Returns a string red or black
     * 
     * The point of this test is to guess what color the next card is going to be (red or black)
     * 
     * Logic:	Calculate the amount of reds and blacks remaining
     *		Whichever color has more, guess that one
     */
    public String firstTest(String newRank, String newSuit)
    {
	updateTotals(newRank, newSuit);	    // Update the card counts

	// If there are more blacks, return black
	// Otherwise, return red
	if (reds < blacks)
	    return "BLACK";
	else
	    return "RED";
    }

    /**
     * Second test: Higher or lower
     *
     * The point of this test is to guess whether the next card played is going to have a higher or lower 
     * rank than the current card
     *
     * Logic: calculate the number of higher and lower ranks to the current card
     */
    public String secondTest(String newRank, String newSuit)
    {
	updateTotals(newRank, newSuit); // Update deck total
	int index = cardIndex(newRank);	// Finds the index of the card
	int higher = 0;			// Holds the number of cards below the current card
	int below = 0;			// Holds the number of cards 

	/* Calculate amount below */
	for (int count = 0; count < index; count++)
	    below = below + rankTotals[count];
	/* Calculate amount above */
	for (int count = index + 1; count < 13; count++)
	    higher = higher + rankTotals[count];

	/* If there are more cards higher, return higher    */
        /* Otherwise, return lower                          */
	if (below < higher)
	    return "HIGHER";
	else
	    return "LOWER";
    }

    /**
     * Third Test: Higher or lower
     *
     * The point of this test is to guess whether the next card rank is going to be
     * between or outside the current and previous cards ranks
     */
    public String thirdTest(String rank1, String suit1, String rank2, String suit2)
    {
	updateTotals(rank2, suit2);	// Update the card counts
	int lowIndex;			// Low card index
	int highIndex;			// high card index

	// Determines which card is high and low
	// Assigns them to their corresponding variable
	if (cardIndex(rank1) < cardIndex(rank2))
	{
	    lowIndex = cardIndex(rank1);
	    highIndex = cardIndex(rank2);
	}
	else
	{
	    lowIndex = cardIndex(rank2);
	    highIndex = cardIndex(rank1);
	}

	int inside = 0;		    // amount of cards inside the 2 cards
	int outside = 0;	    // Amount of cards outside the 2 cards
	

	// Calculate the amount inside
	for (int count = lowIndex + 1; count < highIndex; count++)
	    inside = inside + rankTotals[count];
	
	// Calculate the amount outside pt1
	for (int count = 0; count < lowIndex; count++)
	
	    outside = outside + rankTotals[count];
	
	// calculate outside pt2
	for (int count = highIndex; count < 13; count++)
	{
	    outside = outside + rankTotals[count];
	}

	// If there are more outside cards, return outside
	// Othewise, return inside
	if (inside < outside)
	    return "OUTSIDE";
	else
	    return "INSIDE";
	

    }

    public String fourthTest(String newRank, String newSuit)
    {
	updateTotals(newRank, newSuit);                     // Updates Totals
        String blackWinner, redWinner, suitWinnerString;    // suit winner names
        int blackWinnerNumber, redWinnerNumber;             // suit winner numbers
      
        // Red suit test
        if (numHearts > numDiamonds)
        {
            redWinner = "HEARTS";
            redWinnerNumber = numHearts;
        }
        else
        {
            redWinner = "DIAMONDS";
            redWinnerNumber = numDiamonds;
        }
        
        // Black Suit test
        if (numClubs > numSpades)
        {
            blackWinner = "CLUBS";
            blackWinnerNumber = numClubs;
        }
        
        else
        {
            blackWinner = "SPADES";
            blackWinnerNumber = numSpades;
        }
        
        // Red vs black suit test
        if (blackWinnerNumber > redWinnerNumber)
            suitWinnerString = blackWinner;
        else
            suitWinnerString = redWinner;
        
        return suitWinnerString;
    }

    public int getTotalCards()
    {
	return totalCards;
    }

    public void setTotalCards(int newTotal)
    {
	if (newTotal < 0 || newTotal > 52)
	{
	    totalCards = 0;
	}
	else
	{
	    totalCards = newTotal;
	}
    }

    // get methods for all variables
    public String getReds()
    {
	return Integer.toString(reds);
    }

    public String getBlacks()
    {
	return Integer.toString(blacks);
    }

    public String getClubs()
    {
	return Integer.toString(numClubs);
    }

    public String getDiamonds()
    {
	return Integer.toString(numDiamonds);
    }

    public String getHearts()
    {
	return Integer.toString(numHearts);
    }

    public String getSpades()
    {
	return Integer.toString(numSpades);
    }

    public String getTotalCardsString()
    {
	return Integer.toString(totalCards);
    }

} // class bracket

/**
 * This is the Controller portion of the application
 * 
 * It links the model and the view and updates it accordingly
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Controller
{

    private Deck model;					    // Deck of cards model
    private ViewGame view;				    // GUI - View
    private ActionListener calculateButtonActionListener;   // calculate button action listener
    private ActionListener wrongButtonActionListener;	    // wrong button action listener
    private ActionListener suitRankButtonActionListener;    // action listeners for the suit and rank buttons
    private ActionListener restartButtonActionListener;	    // actions for the restart button
    private ActionListener updateJTableActionListener;	    // actions for the data tabel 
    private String tempRank;				    // holds rank of 2nd card
    private String tempSuit;				    // holds suit of 2nd card

    // Constructor
    public Controller(Deck newModel, ViewGame newView)
    {
	this.model = newModel; // sets model equal to the model passed in
	this.view = newView; // sets view to the ViewGame passed in
	view.getResultLabel().setText("Answer here"); // intialzes the answer
    }

   
    // This is where all the action listener methods/sub-methods are placed
    public void control()
    {
	calculateButtonActions();	// calculate button actions
	wrongButtonActions();		// wrong button actions
	addSuitRankButtonActions();	// suit and rank button actions
	addDataTableActionListeners();	// updates data table text
	restartButtonActions();		// restart button actions
    }

  
 
    // actions for when the calculate button is clicked
    public void calculateButtonActions()
    {
	calculateButtonActionListener = new ActionListener()
	{
	    public void actionPerformed(ActionEvent actionEvent)
	    {
		String answer = determineAnswer();  // answer to be displayed
		resultLabel().setText(answer);	    // set result label to the answer
		updateLevelMenu();		    // updates level menu display
	    }
	};

	// Adds the action listener to the calculate button
	calculateButton().addActionListener(calculateButtonActionListener);
    }

    // Determines which level and the answer for every level
    // Returns a string that is the answer to display in the answer label in the game
    public String determineAnswer()
    {
	int level = levelIndex(); // gets the selected level index
	String rank = rankName(); // gets the selected rank name
	String suit = suitName(); // gets the selected suit name

	// Tests to see which level is selcted in the game
	// When the index is found the rank and suit are passed into the
	// corresponding model method
	// Returns the best answer based on the cards remaining
	switch (level)
	{
	    // level 1: red or black
	    case 0:
		return model.firstTest(rank, suit);
	    // level 2: over-under
	    case 1:
		tempRank = rank;
		tempSuit = suit;
		return model.secondTest(rank, suit);
	    // level 3: inside-outside
	    case 2:
		return model.thirdTest(tempRank, tempSuit, rank, suit);
	    // level 4: suits
	    case 3:
		return model.fourthTest(rank, suit);
	    // error
	    default:
		return "ERROR";
	}

    }

    // Updates the level selector menu to the next one
    public void updateLevelMenu()
    {
	int level = levelIndex();

	switch (level)
	{
	    case 0: // if the level is at index 0 set it to 1
		view.getLevelMenu().setSelectedIndex(1);
		break;
	    case 1: // if the level is at index 1 set it to 2
		view.getLevelMenu().setSelectedIndex(2);
		break;
	    case 2: // if the level is at index 2 set it to 3
		view.getLevelMenu().setSelectedIndex(3);
		break;
	    default: // if the level is at index 3 set it to 0
		view.getLevelMenu().setSelectedIndex(0);
		break;
	}
    }

 
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Actions taken when the wrong Jbutton is clicked
     * 
     * Reset the level menu in view to 0 (red/black)
     */
    public void wrongButtonActions()
    {
	wrongButtonActionListener = new ActionListener()
	{
	    public void actionPerformed(ActionEvent actionEvent)
	    {
		view.getLevelMenu().setSelectedIndex(0); // set the level menu
	    }
	};
	
	wrongButton().addActionListener(wrongButtonActionListener); // add wrong button action listener to wrong button
    }
    
    // end wrong button actions
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * These are the actions for the suit and rank Jbuttons
     * 
     * When a suit button is pressed, the corresponding suit is selected in the suit drop down menu
     * Same thig happens with the rank buttons
     */
    public void addSuitRankButtonActions()
    {
	suitRankButtonActionListener = new ActionListener()
	{
	    public void actionPerformed(ActionEvent actionEvent)
	    {
		String newButton = actionEvent.getActionCommand();  // Set newButton to the value of the button clicked
		suitRankButtonActions(newButton);		    // Pass newButton into suitRankButtonActions 
	    }
	};
	// add suitRankButtonActionListers to all suit and rank buttons
	setSuitRankActionListeners();
    }

    // Adds the suitRankButtonActionListener to all the suit and rank buttons
    public void setSuitRankActionListeners()
    {
	view.getClubSuitButton().addActionListener(suitRankButtonActionListener);	// club
	view.getDiamondSuitButton().addActionListener(suitRankButtonActionListener);	// diamond
	view.getHeartSuitButton().addActionListener(suitRankButtonActionListener);	// heart
	view.getSpadeSuitButton().addActionListener(suitRankButtonActionListener);	// spade
	view.getTwoRankButton().addActionListener(suitRankButtonActionListener);	// two
	view.getThreeRankButton().addActionListener(suitRankButtonActionListener);	// three
	view.getFourRankButton().addActionListener(suitRankButtonActionListener);	// four
	view.getFiveRankButton().addActionListener(suitRankButtonActionListener);	// five
	view.getSixRankButton().addActionListener(suitRankButtonActionListener);	// six
	view.getSevenRankButton().addActionListener(suitRankButtonActionListener);	// seven
	view.getEightRankButton().addActionListener(suitRankButtonActionListener);	// eight
	view.getNineRankButton().addActionListener(suitRankButtonActionListener);	// nine
	view.getTenRankButton().addActionListener(suitRankButtonActionListener);	// ten
	view.getJackRankButton().addActionListener(suitRankButtonActionListener);	// jack
	view.getQueenRankButton().addActionListener(suitRankButtonActionListener);	// queen
	view.getKingRankButton().addActionListener(suitRankButtonActionListener);	// king
	view.getAceRankButton().addActionListener(suitRankButtonActionListener);	// ace

    }

    // actions taken when a suit or button jbutton is clicked
    // find corresponding suit/rank menu index and sets the display to it
    public void suitRankButtonActions(String button)
    {
	if (null != button)
	{
	    switch (button)
	    {
		// Test for suit
		case "Club":
		    view.getSuitMenu().setSelectedIndex(0);
		    break;
		case "Diamond":
		    view.getSuitMenu().setSelectedIndex(1);
		    break;
		case "Heart":
		    view.getSuitMenu().setSelectedIndex(2);
		    break;
		case "Spade":
		    view.getSuitMenu().setSelectedIndex(3);
		    break;

		// Test for rank
		case "2":
		    view.getRankMenu().setSelectedIndex(0);
		    break;
		case "3":
		    view.getRankMenu().setSelectedIndex(1);
		    break;
		case "4":
		    view.getRankMenu().setSelectedIndex(2);
		    break;
		case "5":
		    view.getRankMenu().setSelectedIndex(3);
		    break;
		case "6":
		    view.getRankMenu().setSelectedIndex(4);
		    break;
		case "7":
		    view.getRankMenu().setSelectedIndex(5);
		    break;
		case "8":
		    view.getRankMenu().setSelectedIndex(6);
		    break;
		case "9":
		    view.getRankMenu().setSelectedIndex(7);
		    break;
		case "10":
		    view.getRankMenu().setSelectedIndex(8);
		    break;
		case "Jack":
		    view.getRankMenu().setSelectedIndex(9);
		    break;
		case "Queen":
		    view.getRankMenu().setSelectedIndex(10);
		    break;
		case "King":
		    view.getRankMenu().setSelectedIndex(11);
		    break;
		case "Ace":
		    view.getRankMenu().setSelectedIndex(12);
		    break;

		default:
		    break;
	    }
	}
    }

    // end suit and rank button actions
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Wrong button actions
     * 
     * Exectes when the restart button is clicked
     * 
     * Reset the model to have 52 cards and so forth
     * Set the result label to game restarted
     * Set the level menu index to 0(red/black)
     */
    public void restartButtonActions()
    {
	restartButtonActionListener = new ActionListener()
	{
	    public void actionPerformed(ActionEvent actionEvent)
	    {
		model = new Deck();				    // reset the model (deck)
		view.getResultLabel().setText("Game Restarted!");   // set the result label text to game restarted
		view.getLevelMenu().setSelectedIndex(0);	    // set the level menu back to 0
	    }
	};

	// add action listener to button here
	view.getRestartButton().addActionListener(restartButtonActionListener); // add action listener to the restart button
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Actions for updating the JTable with all the deck info in it
     * 
     * Sets the text for in the second column to the corresponding data in the model
     * Adds this action to the calculate and the restart buttons
     */
    
    // sets the text for the 2nd column in the JTable to the current values in the deck of cards
    void updateDataTabelText()
    {
	// set the JTabel text to the model
	setJTableText(model.getTotalCardsString(), 0);	// set Total text to number of cards left
	setJTableText(model.getReds(), 1);		// set number of reds text
	setJTableText(model.getBlacks(), 2);		// set number of blacks text
	setJTableText(model.getClubs(), 3);		// set number of clubs text
	setJTableText(model.getDiamonds(), 4);		// set nummber of diamonds text
	setJTableText(model.getHearts(), 5);		// set number of hearts text
	setJTableText(model.getSpades(), 6);		// set number of diamonds text
	setJTableText("N/A", 7);			// set (7, 1) to N/A
	setJTableText("N/A", 8);			// set (8, 1) to N/A
	setJTableText("N/A", 9);			// set (9, 1) to N/A
    }
    
    // sets the string passed in to the text of the JTabel in the postion passed in 
    // used more to save time typing
    void setJTableText(String newText, int row)
    {
	view.getTable().setValueAt(newText, row, 1);
    }
    
    // links the updateDataTabelText() to updateJTableActionListener
    public void addDataTableActionListeners()
    {
	updateJTableActionListener = new ActionListener()
	{
	    public void actionPerformed(ActionEvent actionEvent)
	    {
		updateDataTabelText();
	    }
	    
	};
	
	// Add updateJTableActionListener to the calculate and restart JButtons
	view.getCalculateButton().addActionListener(updateJTableActionListener);    
	view.getRestartButton().addActionListener(updateJTableActionListener);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    /**
     * The following methods are for saving time by cutting down on some of the getting method typing
     */
    public int levelIndex()
    {
	return view.getLevelMenu().getSelectedIndex();
    }

    // get name of rank selected
    public String rankName()
    {
	return view.getRankMenu().getSelectedItem().toString();
    }

    // get index of rank selected
    public int rankIndex()
    {
	return view.getRankMenu().getSelectedIndex();
    }

    // get name of suit selected
    public String suitName()
    {
	return view.getSuitMenu().getSelectedItem().toString();
    }

    // get index of suit selected
    public int suitRank()
    {
	return view.getSuitMenu().getSelectedIndex();
    }

    // result label 
    public JLabel resultLabel()
    {
	return view.getResultLabel();
    }

    // calculate button
    public JButton calculateButton()
    {
	return view.getCalculateButton();
    }

    // restart button
    public JButton restartButton()
    {
	return view.getRestartButton();
    }

    // wrong button
    public JButton wrongButton()
    {
	return view.getWrongButton();
    }
} // class end

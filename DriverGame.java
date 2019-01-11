/**
 * This is the main part of the application
 * 
 * Created by Ryan Rickgauer on 4.9.2018
 */
import java.util.Scanner;

public class DriverGame
{
    public static void main(String[] args)
    {

	Deck d = new Deck();

	Scanner input = new Scanner(System.in);

	Deck deck = new Deck();
	ViewGame view = new ViewGame();
	Controller controller = new Controller(deck, view);
	controller.control();

    }
}

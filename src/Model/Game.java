package Model;

import java.util.*;

public class Game
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String input = ""; 
		char inputEnter;
		boolean gameRunning = false;

		// Start Up Menu
		System.out.println("\n\tWelcome to Tree House Adventure!\n");
		System.out.println("\t\tWhat would you like to do?\n");
		System.out.println("\t\t> [S] Start New Game\n\t\t> [E] Exit\n");

		// Read in User Input for Start Up Menu
		input = keyboard.nextLine();

		if (input.equalsIgnoreCase("E") )
			System.out.println("\n\t************* [Game Exited] Good Day! ***************");

		//System.out.println("You Entered: " + input);

		if (input.equalsIgnoreCase("S")) gameRunning = true;

		while (gameRunning)
		{
			System.out.println("\t**********************   [Background Story]   ********************"
					+ "\n\n\t*  Destinounce�was born in the�Wackdro�kingdom of�Littlevinelle. *"
					+ "\n\t*  She had a detached temperament, which the queen disapproved,  *"
					+ "\n\t*  so she went off on her own to discover the outskirts of her   *"
					+ "\n\t*  kingdom at the age of 7. She defeated numerous monsters that  *"
					+ "\n\t*  crossed her path and found great power in each one of them.�  *"
					+ "\n\n\t******************************************************************\n");

			System.out.println("\t\t [Press \"Enter\" or \"Return\" (key) to continue...]\n");
			input = keyboard.nextLine();

			if (!input.equalsIgnoreCase("Begin"))
			{
				input = keyboard.nextLine();
			}


			if(input.equals(""))
			{
				System.out.println("\t**********************   [Years Later. . .]   ********************"
						+ "\n\n\t*  A cold-blooded warrior named�Destinounce�has discovered a     *"
						+ "\n\t*  treehouse in a forest as she was defeating a fierce serpent   *"
						+ "\n\t*  that led her to the front of the house. She slashed at it     *"
						+ "\n\t*  part by part, but when she got to the head the serpent hissed *"
						+ "\n\t*  its last words, �Astral canary..your tasty power of....� The  *"
						+ "\n\t*  warrior gingerly took in these last golden words as a guidance!*"
						+"\n\n\t******************************************************************\n");
			}

			System.out.println("\t\t [Press \"Enter\" or \"Return\" (key) to continue...]\n");

			System.out.println("\t\t\t [Type Begin to start or Exit to leave]"
					+ "\n\t\t\t\tThe descision is yours!");
			input = keyboard.nextLine();

			if (input.equalsIgnoreCase("Exit")) 
			{
				System.out.println("\n\t************* [Game Exited] Good Day! ***************");
				System.exit(0);
			}

			System.out.println("\t\t How would you like to be identified young warrior?");
			input = keyboard.nextLine();
			String playerName = input;

			if(playerName != null)
			{
				System.out.println("\n\n\t\t Nice to finally meet the cold blooded warrior " + playerName + "!");
				System.out.print("\t\t\t\t Your journey awaits you, " + playerName + "!");
				gameRunning = false;
			}

			while (input.equalsIgnoreCase("Exit")) 
			{
				gameRunning = false;
				System.out.println("\n\t************* [Game Exited] Good Day! ***************");
			}

			int roomID = 0;
			if(roomID == 0)
			{
				System.out.println("\n\n\t\tYou start to see a treehouse and want to enter!");
				System.out.println("\n\t*********************   [TreeHouse Entrance]   ********************"
						+ "\n\n\t  1. Do you enter the room? \n\t>[Y] Yes \n\t>[N] No");
			}
		}
	}
}

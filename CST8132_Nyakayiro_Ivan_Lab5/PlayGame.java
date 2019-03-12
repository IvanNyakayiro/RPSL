/* Name: IVAN NYAKAYIRO 
* Student ID:  040921410
* Course & Section: CST8132 304 
* Assignment: Lab05
* Date: 2018-10-25
*/
/**
 * 
 */
package rps;

import java.util.Scanner;

/**
 * @author Ivan Nyakayiro
 * @version 1.0
 * @since 2018-10-22
 *
 */
public class PlayGame {
	static Scanner in = new Scanner(System.in);

	/**
	 * Check Exception to Overide the Object
	 */
	public void finalize() {
		try {
			in.close();
		} catch (Exception e) {
		}

	}

	/**
	 * Declare a new Playable variable and instantiate it as a new RockPaperScissors
	 * game with 3 as default number of rounds.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		boolean quit = true;
		int more = 3; // default rounds
		int increment = 2; // incremental variable

		Playable jouex = new RockPaperScissors(more); // polymorphis in play here refrencing an object of type Playable
														// to a new RockPaperScissors
		do {
			jouex.play();
			jouex.displayResults();
			System.out.print("HEY! YOU WANT TO KEEP PLAYING BEST OUT OF " + (more += increment)
					+ " Press Y to continue and N for quiting!: "); // only change if they loose .
			String choice = in.next();
			choice = choice.substring(0, 1).toUpperCase() + choice.substring(1);
			switch (choice) {
			case "Y":
				more += increment;
				break;
			case "N":
				quit = false;
				break;
			default:
				System.out.println("Invalid input, please try again…");
				quit = true;
			}

		} while (quit);

	}

}

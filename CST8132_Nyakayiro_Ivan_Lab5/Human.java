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
 * @see java.util.Scanner
 */

public class Human extends Player {
	/**
	 * Initializing Scanner
	 */

	protected Scanner in;

	/**
	 * Contructor passing scanner as parameter Invoke the super constructor.
	 * 
	 * @param scan
	 */
	public Human(Scanner scan) {
		super(scan.next());
		this.in = scan;
	}

	/**
	 * This boolean omethod impliments the Human to play
	 * 
	 * @return true
	 */
	@Override
	public boolean takeTurn() { // What happens if the Human class does not implement the takeTurn method?
		boolean verify = false;
		do {
			System.out.println(getName().toUpperCase()
					+ "\tIt’s your turn Enter R for \"Rock\", P for \"Paper\", S for \"Scissors\", L for \"Lizard\", O for \"Spock\" or Q to quit");
			String input = in.next();
			input = input.substring(0, 1).toUpperCase();

			verify = true;
			switch (input) {

			case "O":
			case "L":
			case "S":
			case "P":
			case "R":

				lastMove = HandSign.getHandSign(input);
				System.out.println(NAME + " Played " + lastMove);
				verify = false;
				break;
			case "Q":
				return false;
			default:
				System.out.println("Invalid input, please try again…");
				verify = true;
			}

		} while (verify);

		return true;
	}

}

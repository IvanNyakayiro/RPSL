/* Name: IVAN NYAKAYIRO 
* Student ID:  040921410
* Course & Section: CST8132 304 
* Assignment: Lab05
* Date: 2018-10-25
*/
package rps;

/**
 * Define an enumeration called Sign, with 3 elements, referred to as:
 * HandSign.SCISSORS, HandSign.PAPER, HandSign.ROCK.
 * 
 * @author Angela Giddings
 * @version 1.1
 * @since 1.8
 */
public enum HandSign {

	ROCK, PAPER, SCISSORS, LIZARD, SPOCK;

	/**
	 * Get the HandSign for a given letter.
	 * 
	 * @param firstLetter
	 *            The letter representing a HandSign value (R, P, or S).
	 * @return The HandSign value which corresponds to the given letter, otherwise
	 *         return null.
	 */
	public static HandSign getHandSign(String firstLetter) {
		for (HandSign h : HandSign.values())
			if (h.name().startsWith(firstLetter.toUpperCase()))
				return h;
			else 
				return HandSign.SPOCK;
		return null;
	}
	// From what i understand we only have to
	// add two more signes and set their rules in the getwinner method.

	public static int getWinner(HandSign[] moves) {
		if (moves[0] == moves[1]) {
			return -1;
		} else if ((moves[0] == HandSign.SCISSORS && moves[1] == HandSign.PAPER)
				|| (moves[0] == HandSign.PAPER && moves[1] == HandSign.ROCK)
				|| (moves[0] == HandSign.ROCK && moves[1] == HandSign.SCISSORS)
				|| (moves[0] == HandSign.ROCK && moves[1] == HandSign.LIZARD)
				|| (moves[0] == HandSign.SCISSORS && moves[1] == HandSign.LIZARD)
				|| (moves[0] == HandSign.PAPER && moves[1] == HandSign.SPOCK)
				|| (moves[0] == HandSign.LIZARD && moves[1] == HandSign.PAPER)
				|| (moves[0] == HandSign.LIZARD && moves[1] == HandSign.SPOCK)
				|| (moves[0] == HandSign.SPOCK && moves[1] == HandSign.ROCK)
				|| (moves[0] == HandSign.SPOCK && moves[1] == HandSign.SCISSORS)) {
			return 0;
		} else {
			return 1;
		}
	}
}

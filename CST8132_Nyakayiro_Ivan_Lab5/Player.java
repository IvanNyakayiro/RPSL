/* Name: IVAN NYAKAYIRO 
* Student ID:  040921410
* Course & Section: CST8132 304 
* Assignment: Lab05
* Date: 2018-10-25
*/

package rps;

/**
 * This class gives you the players name, Stores the last move and return's
 * winner.
 * 
 * @author Ivan Nyakayiro
 * @version 1.0
 * @since 2018-10-22
 */

public abstract class Player {

	protected final String NAME;
	protected HandSign lastMove;
	protected int wins;
	protected static int ties = 0;

	public Player(String nom) {
		NAME = nom;
		wins = 0;
	}

	/**
	 * Gets the Name
	 * 
	 * @return the name
	 */
	public String getName() {
		return NAME;
	}

	/**
	 * Gets the lastmove
	 * 
	 * @return the lastMove
	 */
	public HandSign getLastMove() {
		return lastMove;
	}

	/**
	 * Get the wins
	 * 
	 * @return the wins
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * Get the ties
	 * 
	 * @return the ties
	 */
	public static int getTies() { // should the getter method for the ties property be static or instance?
		return ties;
	}

	/**
	 * Increments winning streak
	 */

	public void win() {
		wins++;
	}

	/**
	 * Increments ties streak
	 */
	public static void tie() { // should the tie method be static or instance?
		ties++;
	}

	/**
	 * @return Player name and won
	 */
	public String toString() {
		return "Player: " + NAME + "/nWins: " + wins;
	}

	public abstract boolean takeTurn();
}

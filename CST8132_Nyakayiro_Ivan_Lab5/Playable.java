/* Name: IVAN NYAKAYIRO 
* Student ID:  040921410
* Course & Section: CST8132 304 
* Assignment: Lab05
* Date: 2018-10-25
*/
package rps;

/**
 * This class initialize players and display results
 * 
 * @author Ivan Nyakayiro
 * @version 1.0
 * @since 2018-10-22
 */
public interface Playable {


	public int NUM_PLAYERS = 2; // public is the access level.

	/**
	 * Initialize Players
	 * @see initPlayers
	 */
	public void initPlayers();

	/**This method control the number of rounds
	 * and whos turn it is.
	 * @see play
	 */
	public void play();

	/**
	 * @see evaluateRound
	 */
	public void evaluateRound(); // this are abstract method and they are public

	/**
	 * @see displayResults
	 */
	public void displayResults();

}

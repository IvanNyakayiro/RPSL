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
 * @author Ivan NY
 *
 */
public abstract class Game implements Playable {
	protected int numRounds;
	protected Player[] players;
	protected Scanner in;

	public Game(int jeux) {
		numRounds = jeux;
		players = new Player[NUM_PLAYERS];
		in = new Scanner(System.in);
		initPlayers(); // this method was in herited from playable
	}

	/**
	 * Check Exception to Overide the Object
	 */
	public void finalize() {
		try {
			in.close();
		} catch (Exception e) {
		}

	}

}

/* Name: IVAN NYAKAYIRO 
* Student ID:  040921410
* Course & Section: CST8132 304 
* Assignment: Lab05
* Date: 2018-10-25
*/

package rps;

import java.util.Random;

/**
 * @author Ivan Nyakayiro
 * @version 1.0
 * @since 2018-10-22
 * @see java.util.Random
 *
 */
public class Computer extends Player {

	/**
	 * Default constructor passing String value.
	 */
	// You can not use implicit default constructor,
	// beacause th eparent Player class needs a parameter inside.
	public Computer() {
		super("HAL");

	}

	/**
	 * Declare, initialize, and instantiate a variable of type Random
	 * 
	 * @see Random
	 */
	@Override

	// The Scope of the variable is only in this variable
	// it does exist outside of this method, get trashed when this method is
	// done being invoked.

	public boolean takeTurn() {
		Random comp = new Random();
		lastMove = HandSign.values()[comp.nextInt(5)];
		System.out.println(NAME + " it's your turn!");
		System.out.println(NAME + " played " + lastMove);
		return true;

	}

}

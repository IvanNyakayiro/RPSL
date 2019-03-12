/* Name: IVAN NYAKAYIRO 
* Student ID:  040921410
* Course & Section: CST8132 304 
* Assignment: Lab05
* Date: 2018-10-25
*/

package rps; // placed rps in a package

/**
 * This class controls the Players turns to play
 * 
 * @author Ivan Nyakayiro
 * @version 1.0
 * @since 2018-10-22
 *
 */
public class RockPaperScissors extends Game {

	/**
	 * Constructor which takes an int as a parameter.
	 * {@link #RockPaperScissors(int)}
	 * 
	 * @param jeux
	 */
	public RockPaperScissors(int jeux) { // inherited from the Game class with also the 4 methods
		super(jeux);

	}

	/**
	 * The initPlayers method from the Playable interface Initialize the zeroth
	 * element of the array players to be a new Human. Initialize the first element
	 * of the array players to be a new Computer {@link #initPlayers()}
	 */
	@Override
	public void initPlayers() {
		System.out.println("Player's Name: ");
		players[0] = new Human(in);
		players[1] = new Computer();
	}

	/**
	 * The play method from the Playable interface Loops each round.
	 */
	@Override
	public void play() {
		for (int i = 0; i < numRounds; i++) {
			if (players[0].takeTurn() == false) {
				break;
			}
			players[1].takeTurn();
			evaluateRound();
		}

	}

	/**
	 * The evaluateRound method from the Playable interface. Declare an array of
	 * HandSign objects named moves. Initialize an array using the set of return
	 * values from each Player’s getLastMove method {@link #evaluateRound()}
	 */
	@Override
	public void evaluateRound() {
		HandSign[] moves = new HandSign[] { players[0].getLastMove(), players[1].getLastMove() };

		int winner = HandSign.getWinner(moves);
		if (winner == -1) {
			Player.tie();
			System.out.println("It's a tie! " + Player.getTies());
		} else {
			int loser = Math.abs(winner - 1);
			System.out.println(moves[winner] + " beats " + moves[loser] + "! " + players[winner].getName() + " Wins!");
			players[winner].win();
		}
	}

	/**
	 * Display Results method from the Playable interface.
	 */

	@Override
	public void displayResults() {
		Player winner = null;
		for (int i = 0; i < players.length; i++) {
			players[i].toString();
			if (players[i].getWins() > numRounds / 2) {
				winner = players[i];
			}
		}
		System.out.println("The final total number of ties " + Player.getTies());

		if (winner == null) {
			System.out.println("it's a tie game! ");
		} else
			System.out.println("The winner is " + winner.getName());

		System.out.println("Thanks for playing Rock, Paper, Scissors. Bye");
	}

}

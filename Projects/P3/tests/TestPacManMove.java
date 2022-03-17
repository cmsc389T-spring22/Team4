import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException {
		// Creating A Map
		NoFrame frame = new NoFrame(); // Creates A New Map With Walls and Tokens Initialized

		// Creating Players
		PacMan pacman = frame.addPacMan(new Location(5, 5)); // Creates PacMan at location x, y

		// Start The Game
		frame.startGame();
		ArrayList<Location> moves = pacman.get_valid_moves();
		if (moves.size() != 0) {
			assertTrue(pacman.move());
		} else {
			assertFalse(pacman.move());
		}
	}
}

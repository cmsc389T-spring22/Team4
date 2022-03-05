import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostMove extends TestCase {

	public void testGhostMove() throws FileNotFoundException {
		// Creating A Map
		Mainframe frame = new MainFrame(); // Creates A New Map With Walls and Tokens Initialized

		// Creating Players
		Ghost ghost = frame.addGhost(new Location(5, 5), "Ghost", Color.white); // Creates PacMan at location x, y

		// Start The Game
		frame.startGame();
		ArrayList<Location> moves = ghost.get_valid_moves();

		if (moves.size() != 0) {
			ghost.move();
			assertTrue(moves.contains(ghost.myLoc));
		}

		moves = ghost.get_valid_moves();
		if (moves.size() != 0) {
			ghost.move();
			assertTrue(moves.contains(ghost.myLoc));
		}

	}
}

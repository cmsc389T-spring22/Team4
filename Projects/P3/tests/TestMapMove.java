import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestMapMove extends TestCase {

	public void testMapMove() throws FileNotFoundException {
		// Creating A Map
		NoFrame frame = new NoFrame(); // Creates A New Map With Walls and Tokens Initialized

		// Creating Players
		PacMan pacman = frame.addPacMan(new Location(5, 5)); // Creates PacMan at location x, y

		// Start The Game
		frame.startGame();

		ArrayList<Location> locs = pacman.get_valid_moves();

		if (locs.size() != 0) {
			assertTrue(frame.getMap().move("pacman", locs.get(0), Map.Type.PACMAN));
		}
	}
}

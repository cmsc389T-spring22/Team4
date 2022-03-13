import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostInRange extends TestCase {

	public void testGhostInRange() throws FileNotFoundException {
		// Creating A Map
		MainFrame frame = new MainFrame(); // Creates A New Map With Walls and Tokens Initialized

		// Creating Players
		Ghost ghost = frame.addGhost(new Location(1, 0), "gibby", Color.red); // Creates a red ghost named "name" at
																				// location x,y
		PacMan pacman = frame.addPacMan(new Location(0, 0)); // Creates PacMan at location x, y

		// Start The Game
		frame.startGame();

		assertTrue(pacman.is_ghost_in_range());
	}
}

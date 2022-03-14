import junit.framework.*;
import org.junit.Test;

import java.awt.Color;
import java.io.*;

public class TestPacManInRange extends TestCase {

	@Test
	public void testPacManInRange() throws FileNotFoundException {
		NoFrame frame = new NoFrame(); // Creates A New Map With Walls and Tokens Initialized

		// Creating Players
		Ghost ghost = frame.addGhost(new Location(5, 5), "Ghost", Color.white); // Creates PacMan at location x, y
		frame.addPacMan(new Location(4, 5));

		// Start The Game
		frame.startGame();
		assertTrue(ghost.isPacManInRange());
	}

	@Test
	public void testPacManNotInrange() throws FileNotFoundException {
		NoFrame frame = new NoFrame(); // Creates A New Map With Walls and Tokens Initialized

		// Creating Players
		Ghost ghost = frame.addGhost(new Location(5, 5), "Ghost", Color.white); // Creates PacMan at location x, y
		frame.addPacMan(new Location(6, 2));

		// Start The Game
		frame.startGame();
		assertFalse(ghost.isPacManInRange());
	}
}

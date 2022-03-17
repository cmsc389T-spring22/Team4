import java.awt.Color;
import java.io.FileNotFoundException;

import junit.framework.*;

public class TestMapAttack extends TestCase {

	public void testMapAttack() throws FileNotFoundException {
		NoFrame frame = new NoFrame(); // Creates A New Map With Walls and Tokens Initialized

		// Creating Players
		Ghost ghost = frame.addGhost(new Location(2, 3), "gibby", Color.red); // Creates a red ghost named "name" at
																				// location x,y
		PacMan pacman = frame.addPacMan(new Location(3, 3)); // Creates PacMan at location x, y

		// Start The Game
		frame.startGame();

		assertTrue(ghost.myMap.attack("gibby"));
	}
}

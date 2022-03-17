import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() throws FileNotFoundException {
		// Creating A Map
		NoFrame frame = new NoFrame(); // Creates A New Map With Walls and Tokens Initialized

		// Creating Players
		frame.addGhost(new Location(2, 3), "gibby", Color.red); // Creates a red ghost named "name" at
																				// location x,y
		Ghost ghost2 = frame.addGhost(new Location(3, 3), "bibby", Color.blue); // Creates a red ghost named "name" at
																				// location x,y
		frame.addGhost(new Location(4, 3), "dibby", Color.pink); // Creates a red ghost named "name" at
																				// location x,y
		frame.addGhost(new Location(3, 2), "wibby", Color.green); // Creates a red ghost named "name" at
																					// location x,y
		frame.addPacMan(new Location(3, 4)); // Creates PacMan at location x, y

		// alternatively if you don't need the PacMan or Ghost objects in your tests
		frame.initPlayers(); // Creates all of the players

		// Start The Game
		frame.startGame();

		ArrayList<Location> expected = new ArrayList<Location>();
		expected.add(new Location(2, 3));
		expected.add(new Location(4, 3));
		expected.add(new Location(3, 4));
		assertEquals(expected, ghost2.get_valid_moves());
	}
}

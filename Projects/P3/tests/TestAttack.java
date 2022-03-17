import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestAttack extends TestCase {

	public void testAttack() throws FileNotFoundException {
		NoFrame frame = new NoFrame();

		// Creating Players
		Ghost ghost = frame.addGhost(new Location(5, 5), "Ghost", Color.white);
		frame.addPacMan(new Location(4, 5));

		// Start The Game
		frame.startGame();
		assertTrue(ghost.attack());
	}
}

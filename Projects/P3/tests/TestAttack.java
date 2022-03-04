import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestAttack extends TestCase {

	public void testAttack() throws FileNotFoundException{
		Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized

		//Creating Players
		Ghost ghost = frame.addGhost(new Location(6, 6), "Ghost", Color.white);
		frame.addPacMan(new Location(6, 5));

		//Start The Game
		frame.startGame();
		assertTrue(ghost.attack());
	}
}

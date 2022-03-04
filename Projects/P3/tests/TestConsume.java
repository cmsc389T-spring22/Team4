import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestConsume extends TestCase {

	public void testConsume() throws FileNotFoundException {
		Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized

		//Creating Players
		Ghost ghost = frame.addGhost(new Location(1, 0), "test", Color.red); //Creates a red ghost named "name" at location x,y

		//Start The Game
		frame.startGame();

		if (map.getLoc(new Location(1,0))== Map.Type.COOKIE) {
			assertNotNull(pacman.consume());
		} else {
			assertNull(pacman.consume());
		}


	}
}

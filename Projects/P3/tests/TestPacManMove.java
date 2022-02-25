import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException{
		//Creating A Map
		Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized

		//Creating Players
		PacMan pacman = frame.addPacMan(new Location(x, y)); //Creates PacMan at location x, y

		//Start The Game
		frame.startGame();
		ArrayList<Location> moves = pacman.get_valid_moves();
		pacman.move();
		assertTrue(moves.contains(pacman.myLoc));

		moves = pacman.get_valid_moves();
		pacman.move();
		assertTrue(moves.contains(pacman.myLoc));
	}
}

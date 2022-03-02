import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException{
		//Creating A Map
		Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized

		//Creating Players
<<<<<<< Updated upstream
		PacMan pacman = frame.addPacMan(new Location(x, y)); //Creates PacMan at location x, y
=======
		PacMan pacman = frame.addPacMan(new Location(x, y), "Pacman", Color.red); //Creates PacMan at location x, y
>>>>>>> Stashed changes

		//Start The Game
		frame.startGame();
		ArrayList<Location> moves = pacman.get_valid_moves();
<<<<<<< Updated upstream
		pacman.move();
		assertTrue(moves.contains(pacman.myLoc));

		moves = pacman.get_valid_moves();
		pacman.move();
		assertTrue(moves.contains(pacman.myLoc));
=======
		if (moves.size() != 0) {
			pacman.move();
			assertTrue(moves.contains(pacman.myLoc));
		}

		moves = pacman.get_valid_moves();
		if (moves.size() != 0) {
			pacman.move();
			assertTrue(moves.contains(pacman.myLoc));
		}
>>>>>>> Stashed changes
	}
}

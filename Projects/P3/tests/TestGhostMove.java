import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostMove extends TestCase {

	public void testGhostMove() throws FileNotFoundException{
<<<<<<< Updated upstream
		//Creating A Map
		Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized

		//Creating Players
		Ghost ghost = frame.addGhost(new Location(x, y), "name", Color.red); //Creates a red ghost named "name" at location x,y

		//Start The Game
		frame.startGame();
		ArrayList<Location> moves = ghost.get_valid_moves();
		ghost.move();
		assertTrue(moves.contains(ghost.myLoc));

		moves = ghost.get_valid_moves();
		ghost.move();
		assertTrue(moves.contains(ghost.myLoc));


=======
	//Creating A Map
	Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized

	//Creating Players
	Ghost ghost = frame.addGhost(new Location(x, y)); //Creates PacMan at location x, y

	//Start The Game
	frame.startGame();
	ArrayList<Location> moves = ghost.get_valid_moves();
	ghost.move();
	assertTrue(moves.contains(ghost.myLoc));

	moves = ghost.get_valid_moves();
	ghost.move();
	assertTrue(moves.contains(ghost.myLoc));
>>>>>>> Stashed changes
	}
}

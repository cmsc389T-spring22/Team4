import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestMapMove {

	public void testMapMove() {
	//Creating A Map
	Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized

	//Creating Players
	PacMan pacman = frame.addPacMan(new Location(x, y)); //Creates PacMan at location x, y

	//Start The Game
	frame.startGame();

	ArrayList<Location> locs = pacman.get_valid_moves();
	
	assertTrue(frame.move(pacman.name, locs.get(0), Type.PACMAN));
	}
}

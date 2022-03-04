import java.awt.Color;
import junit.framework.*;

public class TestMapAttack {

	public void testMapAttack() {
		MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized

		//Creating Players
		Ghost ghost = frame.addGhost(new Location(2, 3), "gibby", Color.red); //Creates a red ghost named "name" at location x,y
		PacMan pacman = frame.addPacMan(new Location(3, 3)); //Creates PacMan at location x, y

		//alternatively if you don't need the PacMan or Ghost objects in your tests
		frame.initPlayers(); //Creates all of the players

		//Start The Game
		frame.startGame();

		assertTrue(ghost.myMap.attack("gibby"));
	}
}

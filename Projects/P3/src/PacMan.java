import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan{
	String myName;
	Location myLoc;
	Map myMap;
	Location shift; 

	public PacMan(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		return null;	
	}

	public boolean move() {
		return false;
	}

	// Uses Map class's getLoc to see whether the object located at 
	// Locations directly next to pacman's location is of type GHOST
	public boolean is_ghost_in_range() { 
		return myMap.getLoc(myLoc.shift(1, 0)).contains(Map.Type.GHOST) ||
		myMap.getLoc(myLoc.shift(-1, 0)).contains(Map.Type.GHOST) ||
		myMap.getLoc(myLoc.shift(0, 1)).contains(Map.Type.GHOST) || 
		myMap.getLoc(myLoc.shift(0, -1)).contains(Map.Type.GHOST);
	}

	public JComponent consume() { 
 		return null;
	}
}

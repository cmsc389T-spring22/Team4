import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan {
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
		ArrayList<Location> valid_moves = new ArrayList<Location>();

		if (!myMap.getLoc(myLoc.shift(-1, 0)).contains(Map.Type.WALL)) {
			valid_moves.add(myLoc.shift(-1, 0));
		}

		if (!myMap.getLoc(myLoc.shift(1, 0)).contains(Map.Type.WALL)) {
			valid_moves.add(myLoc.shift(1, 0));
		}

		if (!myMap.getLoc(myLoc.shift(0, 1)).contains(Map.Type.WALL)) {
			valid_moves.add(myLoc.shift(0, 1));
		}

		if (!myMap.getLoc(myLoc.shift(0, -1)).contains(Map.Type.WALL)) {
			valid_moves.add(myLoc.shift(0, -1));
		}

		return valid_moves;
	}

	public boolean move() {
		ArrayList<Location> moves = get_valid_moves();
		if (moves.size() == 0) {
			return false;
		} else {
			int move = (int) (Math.random() * moves.size());
			myLoc = get_valid_moves().get(move);
			myMap.move("pacman", myLoc, Map.Type.PACMAN);
			return true;
		}
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
		return myMap.eatCookie("pacman");
	}
}

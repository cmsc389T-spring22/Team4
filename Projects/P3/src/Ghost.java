import java.util.HashSet;
import java.util.ArrayList;

public class Ghost{
	String myName;
	Location myLoc;
	Map myMap;

	public Ghost(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	// Checking if adjacent locations are walls
	public ArrayList<Location> get_valid_moves() {
		ArrayList<Location> valid_moves = new ArrayList<Location>();

		if (!myMap.getLoc(myLoc.shift(-1, 0)).contains(Map.Type.WALL)){
			valid_moves.add(myLoc.shift(-1, 0));
		}

		if (!myMap.getLoc(myLoc.shift(1, 0)).contains(Map.Type.WALL)){
			valid_moves.add(myLoc.shift(1, 0));
		}

		if (!myMap.getLoc(myLoc.shift(0, 1)).contains(Map.Type.WALL)){
			valid_moves.add(myLoc.shift(0, 1));
		}

		if (!myMap.getLoc(myLoc.shift(0, -1)).contains(Map.Type.WALL)){
			valid_moves.add(myLoc.shift(0, -1));
		}

		return valid_moves;
	}

	public boolean move() {
		if (get_valid_moves().size() == 0) {
			return false;
		} else {
			this.myLoc = get_valid_moves().get(0);
			return true;
		}
	}

	public boolean isPacManInRange() {
		HashSet<Map.Type> up = myMap.getLoc(new Location(myLoc.x - 1, myLoc.y - 1));
		if (up != null && up.contains(Map.Type.PACMAN)) {
			return true;
		}
		HashSet<Map.Type> right = myMap.getLoc(new Location(myLoc.x, myLoc.y + 1));
		if (right != null && right.contains(Map.Type.PACMAN)) {
			return true;
		}
		HashSet<Map.Type> down = myMap.getLoc(new Location(myLoc.x + 1, myLoc.y));
		if (down != null && down.contains(Map.Type.PACMAN)) {
			return true;
		}
		HashSet<Map.Type> left = myMap.getLoc(new Location(myLoc.x, myLoc.y - 1));
		if (left != null && left.contains(Map.Type.PACMAN)) {
			return true;
		}
		return false;
	}

	public boolean attack() {
		return false;
	}
}

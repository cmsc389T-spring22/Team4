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

	public ArrayList<Location> get_valid_moves() {
		return null;
	}

	public boolean move() {
		return false;
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

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
		return false;
	}

	public boolean is_pacman_in_range() { 
		return false;
	}

	public boolean attack() {
		return false;
	}
}

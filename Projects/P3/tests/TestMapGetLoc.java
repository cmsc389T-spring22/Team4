import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class TestMapGetLoc extends TestCase {
	private int scale = 20;
	private String fileName = "src/assets/Map.txt";

	/**
	 * This function returns the same map as instantiated in MainFrame
	 * which reads the Map.txt file to create walls and cookies
	 * 
	 * @return Map
	 * @throws FileNotFoundException
	 */
	private Map createMapFromAssetTxt() throws FileNotFoundException {
		Map myMap = new Map(30);
		File text = new File(fileName);
		Scanner scnr = new Scanner(text);
		int row = 0;
		while (scnr.hasNextLine()) {
			String line = scnr.nextLine();
			for (int col = 0; col < line.length(); col++) {
				Location loc = new Location(row, col);

				if (line.charAt(col) == '0') {
					WallComponent wall = new WallComponent(loc.x, loc.y, scale);
					myMap.add("wall", loc, wall, Map.Type.WALL);
					wall.setLocation(row, col);
				} else if (line.charAt(col) == '1') {
					CookieComponent tok = new CookieComponent(loc.x, loc.y, scale);
					myMap.add("tok_x" + row + "_y" + col, loc, tok, Map.Type.COOKIE);
					tok.setLocation(row, col);
				}
			}
			row++;
		}
		scnr.close();
		return myMap;
	}

	/**
	 * Tests that get works on the initial map for all valid locations
	 * 
	 * @throws FileNotFoundException
	 */
	public void testMapGetLoc() throws FileNotFoundException {
		Map myMap = createMapFromAssetTxt();
		for (int row = 0; row < 24; row++) {
			for (int col = 0; col < 25; col++) {
				HashSet<Map.Type> locs = myMap.getLoc(new Location(row, col));
				if (locs == null) {
					assertTrue(row >= 9 && row <= 14);
					assertTrue(col >= 11 && col <= 13);
				} else {
					assertNotNull(locs);
					assertEquals(locs.size(), 1);
					assertTrue(locs.toArray()[0] == Map.Type.COOKIE || locs.toArray()[0] == Map.Type.WALL);
				}
			}
		}
	}

	/**
	 * Tests that multiple but only a set of objects can be added to valid location
	 * 
	 * @throws FileNotFoundException
	 */
	public void testGetLocAddObjects() throws FileNotFoundException {
		Map myMap = createMapFromAssetTxt();
		addGhost(myMap, new Location(3, 4), "ghost1", new Color(0, 0, 0));
		addGhost(myMap, new Location(3, 4), "ghost2", new Color(1, 1, 1));
		addGhost(myMap, new Location(3, 4), "ghost2", new Color(2, 2, 2));

		HashSet<Map.Type> loc = myMap.getLoc(new Location(3, 4));
		assertEquals(2, loc.size());

		PacManComponent pc = new PacManComponent(3, 4, scale);
		myMap.add("pacman", new Location(3, 4), pc, Map.Type.PACMAN);
		assertEquals(3, loc.size());
	}

	public void testGetLocOutOfBounds() throws FileNotFoundException {
		Map myMap = createMapFromAssetTxt();
		HashSet<Map.Type> loc = myMap.getLoc(new Location(-1, -1));
		assertEquals(Map.Type.WALL, loc.toArray()[0]);
	}

	public void addGhost(Map myMap, Location loc, String name, Color color) {
		GhostComponent comp = new GhostComponent(loc.x, loc.y, color, scale);
		myMap.add(name, loc, comp, Map.Type.GHOST);
	}

}

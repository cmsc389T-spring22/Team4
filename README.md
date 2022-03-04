# Project 1: PacMan
###### Members: Jacob Zohdi, Maria Mao, Neha Shijo, Soyoung Hong

## Pacman Display


## Running Code from the Command Line


## PacMan Class
#### get_valid_moves()
#### move()
#### is_ghost_in_range(): () -> bool
The method checks if there is a ghost in range by checking whether the hash set at the indicated locations adjacent to Pacman contain the type "GHOST".
The test is simple; we place Pacman at (0, 0) and a ghost at (1, 0). The test should return true, as the ghost is one above Pacman.
#### consume()

## Ghost Class
#### get_valid_moves(): () -> ArrayList<Location>
The method checks if the adjacent Locations contain the type "WALL". If it doesn't, add to the ArrayList of Locations.
In the test, a ghost is surrounded by three ghosts and Pacman. In this case, because ghosts can move through anything that isn't a wall, the output should contain all four Locations of the other objects.
#### move()
#### is_pacman_in_range()
#### attack()

## Map Class
#### move(String name, Location loc, Type type)
#### getLoc(Location loc)
#### attack(String name): (String name) -> Bool
The method takes the name of a ghost and checks whether that ghost is adjacent to pacman. If it is, then the attack method updates the gameOver variable and ends the game.
The test sets a ghost and pacman adjacent to each other. The method should return true as a result.
#### eatCookie(String Name)
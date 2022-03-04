# Project 1: PacMan
###### Members: Jacob Zohdi, Maria Mao, Neha Shijo, Soyoung Hong


## Running Code from the Command Line

## PacMan Class
#### **get_valid_moves()**
#### **move()**
This method uses get_valid_moves() to find the possible locations that a Pacman can move to from its current location. It then moves it to the first possible location returned by get_valid_moves(). If the pacman can move, the method returns true, otherwise, it returns false. For the test, I created a Pacman object, then called get_valid_moves(), and moved the pacman using move() to the first valid move if there were any valid moves. I tested that the move correctly moved the pacman to one of the valid moves. I did this a second time to test that another move would also return the correct result.
#### **is_ghost_in_range()**
#### **consume()**

## Ghost Class
#### **get_valid_moves()**
#### **move()**
This method uses get_valid_moves() to find the possible locations that a Ghost can move to from its current location. It then moves it to the first possible location returned by get_valid_moves(). If the ghost can move, the method returns true, otherwise, it returns false. For the test, I created a Ghost object, then called get_valid_moves(), and moved the ghost using move() to the first valid move if there were any valid moves. I tested that the move correctly moved the ghost to one of the valid moves. I did this a second time to test that another move would also return the correct result.
#### **is_pacman_in_range()**
#### **attack()**

## Map Class
#### **move(String name, Location loc, Type type)**
This method puts the object specified by the name at the location in the parameter. It returns true if it is able to move the object, and false otherwise. For the test, I got the valid moves for a Pacman, moved it to the first valid move through move, and tested that the move returned true.
#### **getLoc(Location loc)**
#### **attack(String name)**
#### **eatCookie(String Name)**

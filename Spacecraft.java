public class Spacecraft {  
    private int x, y, z;
    private Direction direction;

    public Spacecraft(int initialX, int initialY, int initialZ, Direction initialDirection) {
        x = initialX;
        y = initialY;
        z = initialZ;
        direction = initialDirection;
    }

    public void executeCommands(char[] commands) {
        for (char command : commands) {
            executeCommand(command);
        }
    }

    private void executeCommand(char command) {
        switch (command) {
            case 'f':
                moveForward();
                break;
            case 'b':
                moveBackward();
                break;
            case 'r':
                turnRight();
                break;
            case 'l':
                turnLeft();
                break;
            case 'u':
                turnUp();
                break;
            case 'd':
                turnDown();
                break;
        }
    }

     // Implement Forward Movement
    private void moveForward() {
        if (direction == Direction.NORTH) {
            y++;
        } else if (direction == Direction.SOUTH) {
            y--;
        } else if (direction == Direction.EAST) {
            x++;
        } else if (direction == Direction.WEST) {
            x--;
        } else if (direction == Direction.UP) {
            z++;
        } else if (direction == Direction.DOWN) {
            z--;
        }
    }

    // Implement Backward movement
    private void moveBackward() {
        if (direction == Direction.NORTH) {
            y--;
        } else if (direction == Direction.SOUTH) {
            y++;
        } else if (direction == Direction.EAST) {
            x--;
        } else if (direction == Direction.WEST) {
            x++;
        } else if (direction == Direction.UP) {
            z--;
        } else if (direction == Direction.DOWN) {
            z++;
        }
    }

     // Implement Turning
    private void turnRight() {
        if (direction == Direction.NORTH) {
            direction = Direction.EAST;
        } else if (direction == Direction.EAST) {
            direction = Direction.SOUTH;
        } else if (direction == Direction.SOUTH) {
            direction = Direction.WEST;
        } else if (direction == Direction.WEST) {
            direction = Direction.NORTH;
        } else if (direction == Direction.UP) {
            direction = Direction.EAST;
        } else if (direction == Direction.DOWN) {
            direction = Direction.WEST;
        }
    }
    
    private void turnLeft() {
        if (direction == Direction.NORTH) {
            direction = Direction.WEST;
        } else if (direction == Direction.WEST) {
            direction = Direction.NORTH;
        } else if (direction == Direction.SOUTH) {
            direction = Direction.EAST;
        } else if (direction == Direction.EAST) {
            direction = Direction.SOUTH;
        } else if (direction == Direction.UP) {
            direction = Direction.NORTH;
        } else if (direction == Direction.DOWN) {
            direction = Direction.SOUTH;
        }
    }
    
    // Implement upWard and downward 
    private void turnUp() {
        if (direction == Direction.NORTH || direction == Direction.SOUTH ||
            direction == Direction.EAST || direction == Direction.WEST) {
            direction = Direction.UP;
        }
    }

    private void turnDown() {
        if (direction == Direction.NORTH || direction == Direction.SOUTH ||
            direction == Direction.EAST || direction == Direction.WEST) {
            direction = Direction.DOWN;
        }
    }

    public static void main(String[] args) {
        int initialX = 0, initialY = 0, initialZ = 0;
        Direction initialDirection = Direction.NORTH;
        char[] commands = {'f', 'r', 'u', 'b', 'l'};

        Spacecraft chandrayan3 = new Spacecraft(initialX, initialY, initialZ, initialDirection);

        //command execution in main
        chandrayan3.executeCommands(commands);

        // print final position and direction
        System.out.println("Final Position: (" + chandrayan3.x + ", " + chandrayan3.y + ", " + chandrayan3.z + ")");
        System.out.println("Final Direction: " + chandrayan3.direction.toString().charAt(0));
    }
}

enum Direction {
    NORTH, SOUTH, EAST, WEST, UP, DOWN
}
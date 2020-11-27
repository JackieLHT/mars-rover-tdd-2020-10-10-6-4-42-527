package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    static final char NORTH = 'N';
    static final char EAST = 'E';
    static final char SOUTH = 'S';
    static final char WEST = 'W';
    int xPosition;
    int yPosition;
    char direction;

    public MarsRover(int xPosition, int yPosition, char direction) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public char getDirection() {
        return direction;
    }

    public void move() {
        if (direction == NORTH) {
            yPosition++;
        }
        if (direction == EAST) {
            xPosition++;
        }
        if (direction == SOUTH) {
            yPosition--;
        }
        if (direction == WEST) {
            xPosition--;
        }
    }

    public void turnLeft() {
        if (direction == NORTH) {
            direction = WEST;
        } else if (direction == EAST) {
            direction = NORTH;
        } else if (direction == SOUTH) {
            direction = EAST;
        } else if (direction == WEST) {
            direction = SOUTH;
        }
    }

    public void turnRight() {
        if (direction == NORTH) {
            direction = EAST;
        } else if (direction == EAST) {
            direction = SOUTH;
        } else if (direction == SOUTH) {
            direction = WEST;
        } else if (direction == WEST) {
            direction = NORTH;
        }
    }

    public void processInstructions(String instructions) {
        for (char instruction : instructions.trim().toCharArray()) {
            if (instruction == 'M') {
                this.move();
            } else if (instruction == 'L') {
                this.turnLeft();
            } else if (instruction == 'R') {
                this.turnRight();
            }
        }

    }
}

package com.afs.tdd;

import java.util.stream.Collectors;

public class Coordinates {
    private static final char NORTH = 'N';
    private static final char EAST = 'E';
    private static final char SOUTH = 'S';
    private static final char WEST = 'W';
    private int x_coordinate;
    private int y_coordinate;
    private char direction;

    public Coordinates(int x_coordinate, int y_coordinate, char direction) {
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
        this.direction = direction;
    }

    public void coordinateIncrementByOne() {
        if (direction == NORTH) {
            y_coordinate++;
        }
        if (direction == EAST) {
            x_coordinate++;
        }
        if (direction == SOUTH) {
            y_coordinate--;
        }
        if (direction == WEST) {
            x_coordinate--;
        }
    }

    public void changeDirectionLeft() {
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

    public void changeDirectionRight() {
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

    @Override
    public boolean equals(Object obj) {
        Coordinates coordinates = (Coordinates) obj;
        if (this.x_coordinate == coordinates.x_coordinate && this.y_coordinate == coordinates.y_coordinate && this.direction == coordinates.direction)
            return true;
        return false;
    }


}

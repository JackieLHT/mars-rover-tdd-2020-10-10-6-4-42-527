package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private Coordinates coordinates;

    public MarsRover(int xPosition, int yPosition, char direction) {
        coordinates = new Coordinates(xPosition, yPosition, direction);
    }

    public void move() {
        coordinates.coordinateIncrementByOne();
    }

    public void turnLeft() {
        coordinates.changeDirectionLeft();
    }

    public void turnRight() {
        coordinates.changeDirectionRight();
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }
}

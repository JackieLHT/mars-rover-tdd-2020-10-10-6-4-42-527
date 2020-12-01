package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private Coordinates coordinates;
    public MarsRover(int xPosition, int yPosition, char direction) {
        coordinates = new Coordinates(xPosition,yPosition,direction);
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

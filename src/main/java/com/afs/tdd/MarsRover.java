package com.afs.tdd;

public class MarsRover {
    int xPosition;
    int yPosition;
    String direction;

    public MarsRover(int xPosition,int yPosition, String direction) {
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

    public String getDirection() {
        return direction;
    }

    public void Move() {
        if (direction == "N") {
            yPosition++;
        }
        if (direction == "E") {
            xPosition++;
        }
        if (direction == "S") {
            yPosition--;
        }
        if (direction == "W") {
            xPosition--;
        }
    }

    public void TurnLeft() {
        if (direction == "N") {
            direction = "W";
        }
        if (direction == "E") {
            direction = "N";
        }
        if (direction == "S") {
            direction = "E";
        }
    }
}

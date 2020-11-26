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

    public void move() {
        if (direction == "N") {
            yPosition++;
        }
        else if (direction == "E") {
            xPosition++;
        }
        else if (direction == "S") {
            yPosition--;
        }
        else if (direction == "W") {
            xPosition--;
        }
    }

    public void turnLeft() {
        if (direction == "N") {
            direction = "W";
        }
        else if (direction == "E") {
            direction = "N";
        }
        else if (direction == "S") {
            direction = "E";
        }
        else if (direction == "W") {
            direction = "S";
        }
    }

    public void turnRight() {
        if (direction == "N") {
            direction = "E";
        }
        else if (direction == "E") {
            direction = "S";
        }
        else if (direction == "S") {
            direction = "W";
        }
        else if (direction == "W") {
            direction = "N";
        }
    }

}

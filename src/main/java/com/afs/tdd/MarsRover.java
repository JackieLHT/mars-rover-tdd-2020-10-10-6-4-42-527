package com.afs.tdd;

public class MarsRover {
    int xPosition;
    int yPosition;
    char direction;

    public MarsRover(int xPosition,int yPosition, char direction) {
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

    public void Move() {
        if(direction == 'N') {
            yPosition++;
        }
    }
}

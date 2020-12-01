package com.afs.tdd;

public class Move implements Command {
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.move();
    }
}

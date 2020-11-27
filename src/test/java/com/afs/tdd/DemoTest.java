package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    static final char NORTH = 'N';
    static final char EAST = 'E';
    static final char SOUTH = 'S';
    static final char WEST = 'W';
    @Test
    public void should_return_yPosition_plus_one_when_Move_given_direction_N() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = NORTH;

        MarsRover marsRover = new MarsRover(xPosition,yPosition,direction);
        marsRover.move();

        assertEquals(2,marsRover.getXPosition());
        assertEquals(4,marsRover.getYPosition());
        assertEquals(NORTH,marsRover.getDirection());
    }

    @Test
    public void should_return_xPosition_plus_one_when_Move_given_direction_E() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = EAST;

        MarsRover marsRover = new MarsRover(xPosition,yPosition,direction);
        marsRover.move();

        assertEquals(3,marsRover.getXPosition());
        assertEquals(3,marsRover.getYPosition());
        assertEquals(EAST,marsRover.getDirection());
    }

    @Test
    public void should_return_yPosition_minus_one_when_Move_given_direction_S() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = SOUTH;

        MarsRover marsRover = new MarsRover(xPosition,yPosition,direction);
        marsRover.move();

        assertEquals(2,marsRover.getXPosition());
        assertEquals(2,marsRover.getYPosition());
        assertEquals(SOUTH,marsRover.getDirection());
    }

    @Test
    public void should_return_xPosition_minus_one_when_Move_given_direction_W() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = WEST;

        MarsRover marsRover = new MarsRover(xPosition,yPosition,direction);
        marsRover.move();

        assertEquals(1,marsRover.getXPosition());
        assertEquals(3,marsRover.getYPosition());
        assertEquals(WEST,marsRover.getDirection());
    }

    @Test
    public void should_return_direction_W_when_TurnLeft_with_direction_N() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = NORTH;

        MarsRover marsRover = new MarsRover(xPosition,yPosition,direction);
        marsRover.turnLeft();

        assertEquals(2,marsRover.getXPosition());
        assertEquals(3,marsRover.getYPosition());
        assertEquals(WEST,marsRover.getDirection());
    }

    @Test
    public void should_return_direction_N_when_TurnLeft_with_direction_E() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = EAST;

        MarsRover marsRover = new MarsRover(xPosition,yPosition,direction);
        marsRover.turnLeft();

        assertEquals(2,marsRover.getXPosition());
        assertEquals(3,marsRover.getYPosition());
        assertEquals(NORTH,marsRover.getDirection());
    }

    @Test
    public void should_return_direction_E_when_TurnLeft_with_direction_S() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = SOUTH;

        MarsRover marsRover = new MarsRover(xPosition,yPosition,direction);
        marsRover.turnLeft();

        assertEquals(2,marsRover.getXPosition());
        assertEquals(3,marsRover.getYPosition());
        assertEquals(EAST,marsRover.getDirection());
    }

    @Test
    public void should_return_direction_S_when_TurnLeft_with_direction_W() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = WEST;

        MarsRover marsRover = new MarsRover(xPosition,yPosition,direction);
        marsRover.turnLeft();

        assertEquals(2,marsRover.getXPosition());
        assertEquals(3,marsRover.getYPosition());
        assertEquals(SOUTH,marsRover.getDirection());
    }

    @Test
    public void should_return_direction_E_when_TurnRight_with_direction_N() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = NORTH;

        MarsRover marsRover = new MarsRover(xPosition,yPosition,direction);
        marsRover.turnRight();

        assertEquals(2,marsRover.getXPosition());
        assertEquals(3,marsRover.getYPosition());
        assertEquals(EAST,marsRover.getDirection());
    }

    @Test
    public void should_return_direction_S_when_TurnRight_with_direction_E() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = EAST;

        MarsRover marsRover = new MarsRover(xPosition,yPosition,direction);
        marsRover.turnRight();

        assertEquals(2,marsRover.getXPosition());
        assertEquals(3,marsRover.getYPosition());
        assertEquals(SOUTH,marsRover.getDirection());
    }

    @Test
    public void should_return_direction_W_when_TurnRight_with_direction_S() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = SOUTH;

        MarsRover marsRover = new MarsRover(xPosition,yPosition,direction);
        marsRover.turnRight();

        assertEquals(2,marsRover.getXPosition());
        assertEquals(3,marsRover.getYPosition());
        assertEquals(WEST,marsRover.getDirection());
    }

    @Test
    public void should_return_direction_N_when_TurnRight_with_direction_W() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = WEST;

        MarsRover marsRover = new MarsRover(xPosition,yPosition,direction);
        marsRover.turnRight();

        assertEquals(2,marsRover.getXPosition());
        assertEquals(3,marsRover.getYPosition());
        assertEquals(NORTH,marsRover.getDirection());
    }

    @Test
    public void should_be_at_6_4_S_when_processInstructions_given_MMRMRMLMMMR_initial_at_2_3_N() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = NORTH;
        String instructions = "MMRMRMLMMMR";

        MarsRover marsRover = new MarsRover(xPosition,yPosition,direction);
        marsRover.processInstructions(instructions);

        assertEquals(6,marsRover.getXPosition());
        assertEquals(4,marsRover.getYPosition());
        assertEquals(SOUTH,marsRover.getDirection());

    }

}

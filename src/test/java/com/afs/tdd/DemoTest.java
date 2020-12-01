package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    private static final char NORTH = 'N';
    private static final char EAST = 'E';
    private static final char SOUTH = 'S';
    private static final char WEST = 'W';

    @Test
    public void should_return_yPosition_plus_one_when_Move_given_direction_N() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = NORTH;

        MarsRover marsRover = new MarsRover(xPosition, yPosition, direction);
        marsRover.move();
        Coordinates expected = new Coordinates(2, 4, NORTH);

        assertEquals(expected, marsRover.getCoordinates());

    }

    @Test
    public void should_return_xPosition_plus_one_when_Move_given_direction_E() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = EAST;

        MarsRover marsRover = new MarsRover(xPosition, yPosition, direction);
        marsRover.move();

        Coordinates expected = new Coordinates(3, 3, EAST);

        assertEquals(expected, marsRover.getCoordinates());
    }

    @Test
    public void should_return_yPosition_minus_one_when_Move_given_direction_S() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = SOUTH;

        MarsRover marsRover = new MarsRover(xPosition, yPosition, direction);
        marsRover.move();

        Coordinates expected = new Coordinates(2, 2, SOUTH);

        assertEquals(expected, marsRover.getCoordinates());
    }

    @Test
    public void should_return_xPosition_minus_one_when_Move_given_direction_W() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = WEST;

        MarsRover marsRover = new MarsRover(xPosition, yPosition, direction);

        marsRover.move();

        Coordinates expected = new Coordinates(1, 3, WEST);

        assertEquals(expected, marsRover.getCoordinates());
    }

    @Test
    public void should_return_direction_W_when_TurnLeft_with_direction_N() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = NORTH;

        MarsRover marsRover = new MarsRover(xPosition, yPosition, direction);
        marsRover.turnLeft();

        Coordinates expected = new Coordinates(2, 3, WEST);

        assertEquals(expected, marsRover.getCoordinates());
    }

    @Test
    public void should_return_direction_N_when_TurnLeft_with_direction_E() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = EAST;

        MarsRover marsRover = new MarsRover(xPosition, yPosition, direction);
        marsRover.turnLeft();

        Coordinates expected = new Coordinates(2, 3, NORTH);

        assertEquals(expected, marsRover.getCoordinates());
    }

    @Test
    public void should_return_direction_E_when_TurnLeft_with_direction_S() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = SOUTH;

        MarsRover marsRover = new MarsRover(xPosition, yPosition, direction);
        marsRover.turnLeft();

        Coordinates expected = new Coordinates(2, 3, EAST);

        assertEquals(expected, marsRover.getCoordinates());
    }

    @Test
    public void should_return_direction_S_when_TurnLeft_with_direction_W() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = WEST;

        MarsRover marsRover = new MarsRover(xPosition, yPosition, direction);
        marsRover.turnLeft();

        Coordinates expected = new Coordinates(2, 3, SOUTH);

        assertEquals(expected, marsRover.getCoordinates());
    }

    @Test
    public void should_return_direction_E_when_TurnRight_with_direction_N() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = NORTH;

        MarsRover marsRover = new MarsRover(xPosition, yPosition, direction);
        marsRover.turnRight();

        Coordinates expected = new Coordinates(2, 3, EAST);

        assertEquals(expected, marsRover.getCoordinates());
    }

    @Test
    public void should_return_direction_S_when_TurnRight_with_direction_E() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = EAST;

        MarsRover marsRover = new MarsRover(xPosition, yPosition, direction);
        marsRover.turnRight();

        Coordinates expected = new Coordinates(2, 3, SOUTH);

        assertEquals(expected, marsRover.getCoordinates());
    }

    @Test
    public void should_return_direction_W_when_TurnRight_with_direction_S() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = SOUTH;

        MarsRover marsRover = new MarsRover(xPosition, yPosition, direction);
        marsRover.turnRight();

        Coordinates expected = new Coordinates(2, 3, WEST);

        assertEquals(expected, marsRover.getCoordinates());
    }

    @Test
    public void should_return_direction_N_when_TurnRight_with_direction_W() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = WEST;

        MarsRover marsRover = new MarsRover(xPosition, yPosition, direction);
        marsRover.turnRight();

        Coordinates expected = new Coordinates(2, 3, NORTH);

        assertEquals(expected, marsRover.getCoordinates());
    }

    @Test
    public void should_be_at_6_4_S_when_processInstructions_given_MMRMRMLMMMR_initial_at_2_3_N() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = NORTH;
        String instructions = "MMRMRMLMMMR";
        MarsRover marsRover = new MarsRover(xPosition, yPosition, direction);
        Controller controller = new Controller(marsRover);
        controller.processInstructions(instructions);
        controller.executeCommands();

        Coordinates expected = new Coordinates(6, 4, SOUTH);

        assertEquals(expected, marsRover.getCoordinates());
    }

}

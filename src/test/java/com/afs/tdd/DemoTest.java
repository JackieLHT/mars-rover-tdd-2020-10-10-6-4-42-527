package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    public void should_return_yPosition_plus_one_when_Move_given_direction_N() {
        int xPosition = 2;
        int yPosition = 3;
        String direction = "N";

        MarsRover marsRover = new MarsRover(xPosition,yPosition,direction);
        marsRover.Move();

        assertEquals(2,marsRover.getXPosition());
        assertEquals(4,marsRover.getYPosition());
        assertEquals("N",marsRover.getDirection());
    }

    @Test
    public void should_return_xPosition_plus_one_when_Move_given_direction_E() {
        int xPosition = 2;
        int yPosition = 3;
        String direction = "E";

        MarsRover marsRover = new MarsRover(xPosition,yPosition,direction);
        marsRover.Move();

        assertEquals(3,marsRover.getXPosition());
        assertEquals(3,marsRover.getYPosition());
        assertEquals("E",marsRover.getDirection());
    }

    @Test
    public void should_return_yPosition_minus_one_when_Move_given_direction_S() {
        int xPosition = 2;
        int yPosition = 3;
        String direction = "S";

        MarsRover marsRover = new MarsRover(xPosition,yPosition,direction);
        marsRover.Move();

        assertEquals(2,marsRover.getXPosition());
        assertEquals(2,marsRover.getYPosition());
        assertEquals("S",marsRover.getDirection());
    }

}

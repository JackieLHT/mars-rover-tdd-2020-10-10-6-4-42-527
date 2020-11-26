package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    public void should_return_yPosition_plus_one_when_Move_given_direction_N() {
        int xPosition = 1;
        int yPosition = 2;
        char direction = 'N';

        MarsRover marsRover = new MarsRover(xPosition,yPosition,direction);
        marsRover.Move();

        assertEquals(1,marsRover.getXPosition());
        assertEquals(3,marsRover.getYPosition());
        assertEquals('N',marsRover.getDirection());
    }

    @Test
    public void should_return_xPosition_plus_one_when_Move_given_direction_E() {
        int xPosition = 2;
        int yPosition = 3;
        char direction = 'E';

        MarsRover marsRover = new MarsRover(xPosition,yPosition,direction);
        marsRover.Move();

        assertEquals(3,marsRover.getXPosition());
        assertEquals(2,marsRover.getYPosition());
        assertEquals('E',marsRover.getDirection());
    }

}

package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    public void should_yPosition_plus_one_when_Move_given_direction_N_Position_0_0() {
        int xPosition = 0;
        int yPosition = 0;
        char direction = 'N';

        MarsRover marsRover = new MarsRover(xPosition,yPosition,direction);
        marsRover.Move();

        assertEquals(0,marsRover.getXPosition());
        assertEquals(1,marsRover.getYPosition());
        assertEquals('N',marsRover.getDirection());
    }

}

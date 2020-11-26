package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    public void should_yPosition_plus_one_when_Move_given_direction_N_Position_0_0() {
        char direction = 'N';

        MarsRover marsRover = new MarsRover();
        marsRover.Move(direction);

        assertEquals(0,marsRover.getXPosition());
        assertEquals(1,marsRover.getYPosition());
        assertEquals('N',marsRover.getDirection());
    }

}

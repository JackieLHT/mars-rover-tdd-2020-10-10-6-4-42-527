package com.afs.tdd;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static final char MOVE_FORWARD = 'M';
    public static final char TURN_LEFT = 'L';
    public static final char TURN_RIGHT = 'R';
    private List<Command> commands = new ArrayList<>();
    private MarsRover marsRover;

    public Controller(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    public void processInstructions(String instructions) {
        for (char instruction : instructions.trim().toCharArray()) {
            if (instruction == MOVE_FORWARD) {
                commands.add(new Move());
            } else if (instruction == TURN_LEFT) {
                commands.add(new TurnLeft());
            } else if (instruction == TURN_RIGHT) {
                commands.add(new TurnRight());
            }
        }
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute(marsRover);
        }
    }
}

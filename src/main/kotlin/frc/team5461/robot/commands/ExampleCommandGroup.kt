package frc.team5461.robot.commands

import edu.wpi.first.wpilibj.command.CommandGroup

class ExampleCommandGroup : CommandGroup() {

    init {
        addSequential(ExampleFirstCommand())
        addSequential(ExampleSecondCommand(), 3.0)
    }
}
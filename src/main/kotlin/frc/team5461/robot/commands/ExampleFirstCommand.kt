package frc.team5461.robot.commands

import edu.wpi.first.wpilibj.command.InstantCommand
import frc.team5461.robot.Robot

class ExampleFirstCommand : InstantCommand() {

    init {
        requires(Robot.exampleSubsystem)
    }

    override fun initialize() {
        println("INFO: initialize ExampleFirstCommand")
    }
}
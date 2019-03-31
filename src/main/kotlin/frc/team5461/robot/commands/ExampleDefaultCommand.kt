package frc.team5461.robot.commands

import edu.wpi.first.wpilibj.command.Command
import frc.team5461.robot.Robot

class ExampleDefaultCommand : Command() {

    init {
        requires(Robot.exampleSubsystem)
    }

    override fun initialize() {
        println("INFO: initialize ExampleDefaultCommand")
    }

    override fun isFinished(): Boolean {
        return false
    }
}
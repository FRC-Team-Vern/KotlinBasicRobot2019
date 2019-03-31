package frc.team5461.robot.commands

import edu.wpi.first.wpilibj.command.Command
import frc.team5461.robot.Robot

class ExampleSecondCommand : Command() {

    init {
        requires(Robot.exampleSubsystem)
    }

    override fun initialize() {
        println("INFO: initialize ExampleSecondCommand")
    }

    override fun isFinished(): Boolean {
        return false
    }

    override fun end() {
        println("INFO: end ExampleSecondCommand")
    }

    override fun interrupted() {
        println("INFO: interrupted ExampleSecondCommand")
    }
}
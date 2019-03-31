package frc.team5461.robot.commands

import edu.wpi.first.wpilibj.command.Command
import edu.wpi.first.wpilibj.command.ConditionalCommand
import frc.team5461.robot.Robot

class ExampleConditionalCommand(commandOnTrue : Command, commandOnFalse : Command)
    : ConditionalCommand(commandOnTrue, commandOnFalse) {
    override fun condition(): Boolean {
        return Robot.exampleBoolean
    }
}
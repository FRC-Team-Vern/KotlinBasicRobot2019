package frc.team5461.robot.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import frc.team5461.robot.commands.ExampleDefaultCommand

class ExampleSubsystem : Subsystem() {

    override fun initDefaultCommand() {
        defaultCommand = ExampleDefaultCommand()
    }
}
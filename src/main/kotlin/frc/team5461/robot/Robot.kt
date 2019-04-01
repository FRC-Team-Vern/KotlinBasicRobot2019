package frc.team5461.robot

import edu.wpi.first.wpilibj.TimedRobot
import edu.wpi.first.wpilibj.command.Scheduler
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard
import frc.team5461.robot.commands.*
import frc.team5461.robot.subsystems.ExampleSubsystem

class Robot : TimedRobot() {

    companion object {
        val exampleSubsystem = ExampleSubsystem()
        var exampleBoolean = false
    }

    override fun robotInit() {
        SmartDashboard.putData("Example Single Command", ExampleFirstCommand())
        SmartDashboard.putData("Example Command Group", ExampleCommandGroup())
        SmartDashboard.putBoolean("Example Boolean", false)
        SmartDashboard.putData("Example Conditional Command", ExampleConditionalCommand(ExampleFirstCommand(), ExampleSecondCommand()))
        SmartDashboard.putData("CommandLogDecorator Command", CommandLogDecorator(ExampleSecondCommand(), executePrint = false))
    }

    override fun robotPeriodic() {
        exampleBoolean = SmartDashboard.getBoolean("Example Boolean", false)
        Scheduler.getInstance().run()
    }

    override fun disabledInit() {
        // Do nothing
    }

    override fun disabledPeriodic() {
        // Do nothing
    }

    override fun teleopInit() {
        // Do nothing
    }

    override fun teleopPeriodic() {
//        Scheduler.getInstance().run()
    }
}

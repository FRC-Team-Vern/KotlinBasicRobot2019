package frc.team5461.robot.commands

import edu.wpi.first.wpilibj.command.Command
import edu.wpi.first.wpilibj.command.Subsystem
import frc.team5461.robot.Robot
import java.lang.reflect.Method
import java.util.*

abstract class CommandDecorator(protected val command : Command) : Command() {
    protected val commandName = command.javaClass.simpleName
    protected val executeMethod : Method = Class.forName("edu.wpi.first.wpilibj.command.Command").getDeclaredMethod("execute")
    protected val endMethod : Method = Class.forName("edu.wpi.first.wpilibj.command.Command").getDeclaredMethod("end")
    protected val interruptedMethod : Method = Class.forName("edu.wpi.first.wpilibj.command.Command").getDeclaredMethod("interrupted")
    protected val initializeMethod : Method = Class.forName("edu.wpi.first.wpilibj.command.Command").getDeclaredMethod("initialize")
    protected val isFinishedMethod : Method = Class.forName("edu.wpi.first.wpilibj.command.Command").getDeclaredMethod("isFinished")
    protected val getRequirementsMethod : Method = Class.forName("edu.wpi.first.wpilibj.command.Command").getDeclaredMethod("getRequirements")

    init {
        executeMethod.isAccessible = true
        endMethod.isAccessible = true
        interruptedMethod.isAccessible = true
        initializeMethod.isAccessible = true
        isFinishedMethod.isAccessible = true
        getRequirementsMethod.isAccessible = true
        @Suppress("UNCHECKED_CAST")
        val e  = getRequirementsMethod.invoke(command) as Enumeration<Subsystem>
        while (e.hasMoreElements()) {
            requires(e.nextElement() as Subsystem)
        }
    }

    override fun execute() {
        executeMethod.invoke(command)
    }

    override fun end() {
        endMethod.invoke(command)
        super.end()
    }

    override fun interrupted() {
        interruptedMethod.invoke(command)
        super.interrupted()
    }

    override fun initialize() {
        initializeMethod.invoke(command)
    }
}

package frc.team5461.robot.commands

import edu.wpi.first.wpilibj.command.Command

class CommandLogDecorator(command: Command, private val executePrint: Boolean = false) : CommandDecorator(command) {

    override fun initialize() {
        println("INFO: LogDecorator initialize $commandName")
        super.initialize()
    }

    override fun execute() {
        if (executePrint) {
            println("INFO: LogDecorator execute $commandName")
        }
        super.execute()
    }

    override fun isFinished(): Boolean {
        val finished = isFinishedMethod.invoke(command) as Boolean
        if (finished) {
            println("INFO: LogDecorator finished $commandName")
        }
        return finished
    }

    override fun end() {
        println("INFO: LogDecorator end $commandName")
        super.end()
    }

    override fun interrupted() {
        println("INFO: LogDecorator interrupted $commandName")
        super.interrupted()
    }

    override fun cancel() {
        println("INFO: LogDecorator cancel $commandName")
        super.cancel()
    }
}
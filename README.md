Kotlin Basic Robot 2019
---

**NOTE:** While Kotlin is a great language and will play just fine with Gradle, in FRC it is still an unofficially supported language, meaning support from the WPILib Team, and from CSAs at season events is not guaranteed. By using this language, you note that you may be on your own for any during-event troubleshooting.

This example involves building and deploying Kotlin sources. This gives a baseline implementation, for more details on building with Kotlin please see the [Kotlin Gradle User Guide](https://kotlinlang.org/docs/reference/using-gradle.html)

**We still recommend using Intellij for Kotlin development since at least at this point it appears to have the best Kotlin support.**

####Intellij Build Project:

<img src="images/GradleBuild.PNG" width="400"/>

####Intellij Deploy Project:

<img src="images/GradleBuild.PNG?raw=true" width="400"/>

####Example Usage:

"Example Single Command" launches ExampleFirstCommand which is an InstantCommand.
"Example Command Group" launches ExampleFirstCommand which then launches ExampleSecondCommand which is a command that does not finish normally, but there is a 3-second timeout in the CommanGroup.
"Example Boolean" has been set to a Button to allow us to switch between either calling ExampleFirstCommand or ExampleSecondCommand.

####Example ShuffleBoard:

![Alt text](images/ShuffleBoardExample.PNG?raw=true "ShuffleBoard Example")
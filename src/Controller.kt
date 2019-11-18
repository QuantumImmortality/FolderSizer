import Config.ConfigManager
import Config.Configuration
import Directories.Directory
import Logging.Logger

fun main(args: Array<String>){

    //val configManager = ConfigManager()
    //val configs: Configuration = configManager.loadConfig()
    val dir = Directory()

    if (args.isEmpty()) {
        Logger.writeLogMessage("Directory not specified", Logger.LogLevel.ERROR)
        return
    }

    println(dir.getSize(args.joinToString(" ")))
}
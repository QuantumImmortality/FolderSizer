package Directories

import Logging.Logger.*
import Logging.Logger.Companion.writeLogMessage
import java.io.File

class Directory {

    fun getSize(directory: String): Long {
        if(!validator(directory))
            return 0
        return sizer(File(directory))

    }

    fun validator(directory: String): Boolean {
        if(!File(directory).exists()) {
            writeLogMessage("Directory does not exist", LogLevel.ERROR)
            return false
        }

        return true
    }

    fun sizer(dir: File): Long {
        var size: Long = 0

        dir.length()
        dir.listFiles().forEach {
            size += if(it.isFile)
                it.length()
            else
                sizer(it)
        }

        return size
    }
}
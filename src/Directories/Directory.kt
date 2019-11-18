package Directories

import Logging.Logger.*
import Logging.Logger.Companion.writeLogMessage
import java.io.File

class Directory {

    /**
     * Intermediary to get the size of the directory
     * @param directory The target directory
     * @return Size of the directory and its sub-directories in MBs
     */
    fun getSize(directory: String): Double {
        if(!validator(directory))
            return 0.0
        return sizer(File(directory)) / 1e+6
    }

    /**
     * Determines if the directory given is valid
     * @param directory The target directory
     * @return Whether directory was valid or not
     */
    fun validator(directory: String): Boolean {
        if(!File(directory).exists()) {
            writeLogMessage("Directory does not exist", LogLevel.ERROR)
            return false
        }

        return true
    }

    /**
     * Recursively get the size of the files in the
     * target directory and that of its sub-directories
     * @param dir The directory to evaluate the size of
     * @return The size of the directory
     */
    fun sizer(dir: File): Long {
        var size: Long = 0

        //dir.length()
        dir.listFiles().forEach {
            size += if(it.isFile)
                it.length()
            else
                sizer(it)
        }

        return size
    }
}
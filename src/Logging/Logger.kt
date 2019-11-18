package Logging

/**
 * Container for logging facilities
 */
class Logger{

    //The type of output logged
    enum class LogLevel {
        DEBUG, WARN, ERROR
    }

    companion object {

        /**
         * Print the [statement] to console with the respective
         * [logLevel] tag
         */
        fun writeLogMessage(statement: String, logLevel: LogLevel) {
            println("[$logLevel]: $statement")
        }
    }
}
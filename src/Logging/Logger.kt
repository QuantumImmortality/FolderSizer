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
         * Prints the desired message to console with an associated log tag
         * @param statement The message to print
         * @param logLevel The log tag
         */
        fun writeLogMessage(statement: String, logLevel: LogLevel) {
            println("[$logLevel]: $statement")
        }
    }
}
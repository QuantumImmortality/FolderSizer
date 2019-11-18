package Config

/**
 * Container for the different configuration options of the system
 */
data class Configuration(val config: Map<String, Any?>) {
    val debug: Boolean by config
}
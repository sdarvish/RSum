package ir.rsum.repositories

enum class ConfigurationState {
    CONFIGURED,
    NOT_CONFIGURED,
    PARTIALLY_CONFIGURED;

    companion object {
        fun valueOfOrDefault(
            name: String?,
            default: ConfigurationState = NOT_CONFIGURED
        ): ConfigurationState = name?.runCatching {
            valueOf(name)
        }?.getOrNull() ?: default
    }
}

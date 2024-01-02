package ir.rsum.core.settings.domain

interface ISettingRepository {
    fun configurationCompleted()
    fun getConfigurationState(): ConfigurationState
}
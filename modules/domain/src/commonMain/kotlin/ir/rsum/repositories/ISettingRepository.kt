package ir.rsum.repositories

interface ISettingRepository {
    fun configurationCompleted()
    fun getConfigurationState(): ConfigurationState
}
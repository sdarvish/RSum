package ir.rsum.core.settings.data

import com.russhwolf.settings.Settings
import com.russhwolf.settings.set
import ir.rsum.core.settings.domain.ConfigurationState
import ir.rsum.core.settings.domain.ISettingRepository

class SettingRepository(private val settings: Settings) : ISettingRepository {
    override fun configurationCompleted() {
        settings[K_GLOBAL_CONFIGURATION_STATE] = ConfigurationState.CONFIGURED.name
    }

    override fun getConfigurationState(): ConfigurationState {
        return settings.getStringOrNull(K_GLOBAL_CONFIGURATION_STATE).let {
            ConfigurationState.valueOfOrDefault(it)
        }
    }

    companion object {
        private const val K_GLOBAL_CONFIGURATION_STATE = "GLOBAL_CONFIGURATION_STATE"
    }
}
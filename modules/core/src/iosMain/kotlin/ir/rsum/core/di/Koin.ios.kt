package ir.rsum.core.di

import com.russhwolf.settings.NSUserDefaultsSettings
import com.russhwolf.settings.Settings
import org.koin.core.module.Module
import org.koin.dsl.module
import platform.Foundation.NSUserDefaults

actual val preferenceModule: Module = module {
    factory<Settings> { NSUserDefaultsSettings(NSUserDefaults("global_config")) }
}
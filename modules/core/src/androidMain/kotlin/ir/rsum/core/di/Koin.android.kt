package ir.rsum.core.di

import android.content.Context
import com.russhwolf.settings.Settings
import com.russhwolf.settings.SharedPreferencesSettings
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

actual val preferenceModule: Module = module {
    factory<Settings> {
        SharedPreferencesSettings(
            androidContext().getSharedPreferences("global_configuration", Context.MODE_PRIVATE)
        )
    }
}
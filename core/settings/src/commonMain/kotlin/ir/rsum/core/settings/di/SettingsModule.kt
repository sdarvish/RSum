package ir.rsum.core.settings.di

import ir.rsum.core.settings.data.SettingRepository
import ir.rsum.core.settings.domain.ISettingRepository
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val settingModule = module {
    includes(preferenceModule)
    singleOf(::SettingRepository) bind ISettingRepository::class
}
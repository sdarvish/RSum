package ir.rsum.core.di

import ir.rsum.data.repositories.SettingRepository
import ir.rsum.repositories.ISettingRepository
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module


expect val preferenceModule: Module

val settingModule = module {
    singleOf(::SettingRepository) bind ISettingRepository::class
}
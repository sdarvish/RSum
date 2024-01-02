package ir.rsum.di

import ir.rsum.core.settings.di.settingModule
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

internal fun startDI(appDeclaration: KoinAppDeclaration) = startKoin {
    modules(settingModule)
    appDeclaration()
}

fun startAppDI(appDeclaration: KoinAppDeclaration = {}) = startDI(appDeclaration)
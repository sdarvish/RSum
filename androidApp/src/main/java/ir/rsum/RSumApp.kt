package ir.rsum

import android.app.Application
import ir.rsum.core.di.preferenceModule
import ir.rsum.core.di.settingModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class RSumApp :  Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@RSumApp)
            modules(
                settingModule + preferenceModule
            )
        }
    }
}
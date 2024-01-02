package ir.rsum

import android.app.Application
import ir.rsum.di.startAppDI
import org.koin.android.ext.koin.androidContext

class RSumApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startAppDI { androidContext(this@RSumApp) }
    }
}
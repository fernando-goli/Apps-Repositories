package com.fgomes.githubrepository

import android.app.Application
import com.fgomes.githubrepository.data.di.DataModule
import com.fgomes.githubrepository.domain.di.DomainModule
import com.fgomes.githubrepository.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}
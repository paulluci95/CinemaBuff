package com.levimoreira.cinemabuff.infrastructure.application

import android.app.Application
import com.cinemabuff.data.network.networkModule
import com.levimoreira.cinemabuff.movie.movieModule
import org.koin.android.ext.android.startKoin

class CinemaBuffApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(appModule, networkModule, movieModule))
    }
}
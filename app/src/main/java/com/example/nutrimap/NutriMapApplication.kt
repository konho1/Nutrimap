package com.example.nutrimap

import android.app.Application
import com.kakao.vectormap.KakaoMapSdk

class NutriMapApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        KakaoMapSdk.init(
            this,
            2fb03af2c2a1e83106b8c6abfbe6e408
        )
    }
}
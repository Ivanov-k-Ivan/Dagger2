package com.icecodejuice.dagger2

import android.app.Application
import com.icecodejuice.dagger2.app.AppComponent
import com.icecodejuice.dagger2.app.AppModule
import com.icecodejuice.dagger2.app.DaggerAppComponent
import com.icecodejuice.dagger2.local.UserComponent
import com.icecodejuice.dagger2.local.UserModule

class DaggerApplication: Application() {
    private lateinit var appModule: AppComponent
    private lateinit var userModule: UserComponent

    override fun onCreate() {
        super.onCreate()
        appModule = DaggerAppComponent.builder().appModule(AppModule()).build()
        userModule = appModule.createUserComponent(UserModule())

    }

    fun getAppComponent() = appModule

    fun getUserComponent() = userModule

    fun resetUserComponent(): UserComponent {
        userModule = appModule.createUserComponent(UserModule())
        return userModule
    }

}
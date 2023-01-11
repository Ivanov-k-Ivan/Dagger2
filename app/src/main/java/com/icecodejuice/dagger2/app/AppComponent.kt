package com.icecodejuice.dagger2.app

import com.icecodejuice.dagger2.MainActivity
import com.icecodejuice.dagger2.local.UserComponent
import com.icecodejuice.dagger2.local.UserModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
//    fun inject(activity: MainActivity)
    fun plus(userModule: UserModule): UserComponent
}
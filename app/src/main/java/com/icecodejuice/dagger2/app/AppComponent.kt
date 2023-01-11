package com.icecodejuice.dagger2.app

import com.icecodejuice.dagger2.DaggerApplication
import com.icecodejuice.dagger2.local.UserComponent
import com.icecodejuice.dagger2.local.UserModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun createUserComponent(userModule: UserModule): UserComponent
}
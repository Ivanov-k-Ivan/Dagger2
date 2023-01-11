package com.icecodejuice.dagger2.local

import android.util.Log
import com.icecodejuice.dagger2.User
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UserModule() {

    @Provides
    fun logMeSomething(str: String) = Log.d("TAAAAAAG", str)

    @UserScope
    @Provides
    fun getUser() = User()
}
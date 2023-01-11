package com.icecodejuice.dagger2.local

import com.icecodejuice.dagger2.MainActivity
import com.icecodejuice.dagger2.SecondActivity
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@UserScope
@Subcomponent(modules = [UserModule::class])
interface UserComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: SecondActivity)
}
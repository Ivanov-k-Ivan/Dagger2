package com.icecodejuice.dagger2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class SecondActivity: AppCompatActivity() {

    @Inject
    lateinit var user1: User

    @Inject
    lateinit var user2: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as DaggerApplication).getUserComponent().inject(this)

        setContentView(R.layout.activity_second)

        Log.d("TAAAAAAG", "SecondActivity user1 is: $user1")
        Log.d("TAAAAAAG", "SecondActivity user2 is: $user2")

        findViewById<Button>(R.id.btn_next_activity).setOnClickListener {
            (application as DaggerApplication).resetUserComponent()

            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }
}
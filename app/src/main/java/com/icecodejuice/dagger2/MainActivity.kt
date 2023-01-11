package com.icecodejuice.dagger2

import android.content.Intent
import android.icu.lang.UCharacter.GraphemeClusterBreak.L
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var user1: User

    @Inject
    lateinit var user2: User


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as DaggerApplication).getUserComponent().inject(this)

        setContentView(R.layout.activity_main)

        Log.d("TAAAAAAG", "MainActivity user1 is: $user1")
        Log.d("TAAAAAAG", "MainActivity user2 is: $user2")

        findViewById<Button>(R.id.btn_next_activity).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            finish()
        }
    }


}
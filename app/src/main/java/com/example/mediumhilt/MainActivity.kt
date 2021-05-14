package com.example.mediumhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    //Field Injection
    @Inject
    lateinit var alex : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        val juventus = Team()
        val elastic = Skill()
        val ronald = Player(juventus, elastic)
        ronald.train()
         */
        alex.train()
    }
}
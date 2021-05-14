package com.example.mediumhilt

import android.util.Log
import android.widget.Toast
import javax.inject.Inject

//Constructor Injection
class Player
    @Inject constructor(team: Team, skill: Skill) {
    val TAG = "LOG_PLAYER"
    fun train(){
        Log.i(TAG, "training")
    }
}
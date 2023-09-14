package com.example.a6month2hw.ui

import android.app.Application
import androidx.room.Room
import com.example.a6month2hw.data.db.AppDatabase

class App : Application(){

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "Task-file"
        ).allowMainThreadQueries().build()
    }

    companion object {
        lateinit var db: AppDatabase
    }

}
package com.example.a6month2hw.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.a6month2hw.data.model.Task

@Database(entities = [Task::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}
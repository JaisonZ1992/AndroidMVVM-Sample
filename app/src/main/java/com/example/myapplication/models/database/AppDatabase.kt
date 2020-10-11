package com.example.myapplication.models.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.models.Post
import com.example.myapplication.models.PostDao

@Database(entities = [Post::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}
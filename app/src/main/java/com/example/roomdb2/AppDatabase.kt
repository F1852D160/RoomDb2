package com.example.roomdb2

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Persona::class], version = 1)
abstract class AppDatabase:RoomDatabase() {

    abstract fun personaDao():PersonaDao

}
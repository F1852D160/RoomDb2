package com.example.roomdb2

import android.app.Application
import androidx.room.Room

class PersonasApp:Application() {
    companion object{
        lateinit var db :AppDatabase
    }

    override fun onCreate() {
        super.onCreate()

        PersonasApp.db = Room.databaseBuilder(applicationContext,AppDatabase::class.java,
            "personas.db"
        )
            .fallbackToDestructiveMigration() // para destruir todos los datos al migrar de una version a otra
            .allowMainThreadQueries() // para habilitar consultas a la db en el thread principal
            .build()


    }
}
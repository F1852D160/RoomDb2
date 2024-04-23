package com.example.roomdb2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val p = Persona(2,"JORGE 3","AGUIRRE","http://....")

        //PersonasApp.db.personaDao().insertPersona(p)
        var personaList:List<Persona> = PersonasApp.db.personaDao().selectPersonas()
        for (p in personaList){
            p.nombre?.let { Log.i("EJEMPLO", it) }
        }
        Log.i("EJEMPLO","Se inserto correctamente")


    }
}
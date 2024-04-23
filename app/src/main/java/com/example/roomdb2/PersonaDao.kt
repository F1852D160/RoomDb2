package com.example.roomdb2

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface PersonaDao {

    @Query("select * from persona")
    fun selectPersonas():List<Persona>

    @Insert
    fun insertPersona(vararg per:Persona)

    @Update
    fun updatePersona(p:Persona)

    @Delete
    fun deletePersona(p:Persona)

}
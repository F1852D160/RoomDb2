package com.example.roomdb2

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Persona(
    @PrimaryKey
    val id:Long,val nombre:String?,val apellido:String?,val imagen:String?){

    override fun toString(): String {
        return nombre ?: ""
    }
}

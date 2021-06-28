package com.oceanbrasil.jornadaocean_banco_de_dados

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word_table")
class Word (@PrimaryKey @ColumnInfo(name = "word") val Word: String) {

}
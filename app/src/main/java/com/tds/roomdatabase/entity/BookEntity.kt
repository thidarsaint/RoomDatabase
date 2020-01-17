package com.tds.roomdatabase.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class BookEntity {

    @PrimaryKey
    @ColumnInfo(name = "id")
    var bookId : Int = 0

    @ColumnInfo(name = "Name")
    var bookName : String = ""
}
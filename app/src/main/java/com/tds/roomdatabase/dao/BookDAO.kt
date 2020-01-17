package com.tds.roomdatabase.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.tds.roomdatabase.entity.BookEntity

@Dao
interface BookDAO{
    @Insert
    fun save(book : BookEntity)

    @Query(value = "Select * from BookEntity")
    fun getAllBooks(): List<BookEntity>
}
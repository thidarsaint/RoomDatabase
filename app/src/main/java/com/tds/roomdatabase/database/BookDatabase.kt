package com.tds.roomdatabase.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tds.roomdatabase.dao.BookDAO
import com.tds.roomdatabase.entity.BookEntity

@Database(entities = [(BookEntity::class)], version = 1)
abstract class BookDatabase : RoomDatabase(){
    abstract fun bookDao(): BookDAO
}